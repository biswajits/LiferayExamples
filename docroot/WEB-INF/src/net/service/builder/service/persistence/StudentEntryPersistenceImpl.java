/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package net.service.builder.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.service.builder.NoSuchEntryException;
import net.service.builder.model.StudentEntry;
import net.service.builder.model.impl.StudentEntryImpl;
import net.service.builder.model.impl.StudentEntryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the student entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see StudentEntryPersistence
 * @see StudentEntryUtil
 * @generated
 */
public class StudentEntryPersistenceImpl extends BasePersistenceImpl<StudentEntry>
	implements StudentEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StudentEntryUtil} to access the student entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StudentEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
			StudentEntryModelImpl.FINDER_CACHE_ENABLED, StudentEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
			StudentEntryModelImpl.FINDER_CACHE_ENABLED, StudentEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
			StudentEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the student entry in the entity cache if it is enabled.
	 *
	 * @param studentEntry the student entry
	 */
	public void cacheResult(StudentEntry studentEntry) {
		EntityCacheUtil.putResult(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
			StudentEntryImpl.class, studentEntry.getPrimaryKey(), studentEntry);

		studentEntry.resetOriginalValues();
	}

	/**
	 * Caches the student entries in the entity cache if it is enabled.
	 *
	 * @param studentEntries the student entries
	 */
	public void cacheResult(List<StudentEntry> studentEntries) {
		for (StudentEntry studentEntry : studentEntries) {
			if (EntityCacheUtil.getResult(
						StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
						StudentEntryImpl.class, studentEntry.getPrimaryKey()) == null) {
				cacheResult(studentEntry);
			}
			else {
				studentEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all student entries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StudentEntryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StudentEntryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the student entry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StudentEntry studentEntry) {
		EntityCacheUtil.removeResult(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
			StudentEntryImpl.class, studentEntry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StudentEntry> studentEntries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StudentEntry studentEntry : studentEntries) {
			EntityCacheUtil.removeResult(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
				StudentEntryImpl.class, studentEntry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new student entry with the primary key. Does not add the student entry to the database.
	 *
	 * @param studentId the primary key for the new student entry
	 * @return the new student entry
	 */
	public StudentEntry create(long studentId) {
		StudentEntry studentEntry = new StudentEntryImpl();

		studentEntry.setNew(true);
		studentEntry.setPrimaryKey(studentId);

		return studentEntry;
	}

	/**
	 * Removes the student entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student entry
	 * @return the student entry that was removed
	 * @throws net.service.builder.NoSuchEntryException if a student entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public StudentEntry remove(long studentId)
		throws NoSuchEntryException, SystemException {
		return remove(Long.valueOf(studentId));
	}

	/**
	 * Removes the student entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the student entry
	 * @return the student entry that was removed
	 * @throws net.service.builder.NoSuchEntryException if a student entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentEntry remove(Serializable primaryKey)
		throws NoSuchEntryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StudentEntry studentEntry = (StudentEntry)session.get(StudentEntryImpl.class,
					primaryKey);

			if (studentEntry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(studentEntry);
		}
		catch (NoSuchEntryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected StudentEntry removeImpl(StudentEntry studentEntry)
		throws SystemException {
		studentEntry = toUnwrappedModel(studentEntry);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, studentEntry);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(studentEntry);

		return studentEntry;
	}

	@Override
	public StudentEntry updateImpl(
		net.service.builder.model.StudentEntry studentEntry, boolean merge)
		throws SystemException {
		studentEntry = toUnwrappedModel(studentEntry);

		boolean isNew = studentEntry.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, studentEntry, merge);

			studentEntry.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
			StudentEntryImpl.class, studentEntry.getPrimaryKey(), studentEntry);

		return studentEntry;
	}

	protected StudentEntry toUnwrappedModel(StudentEntry studentEntry) {
		if (studentEntry instanceof StudentEntryImpl) {
			return studentEntry;
		}

		StudentEntryImpl studentEntryImpl = new StudentEntryImpl();

		studentEntryImpl.setNew(studentEntry.isNew());
		studentEntryImpl.setPrimaryKey(studentEntry.getPrimaryKey());

		studentEntryImpl.setStudentId(studentEntry.getStudentId());
		studentEntryImpl.setName(studentEntry.getName());

		return studentEntryImpl;
	}

	/**
	 * Returns the student entry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the student entry
	 * @return the student entry
	 * @throws com.liferay.portal.NoSuchModelException if a student entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the student entry with the primary key or throws a {@link net.service.builder.NoSuchEntryException} if it could not be found.
	 *
	 * @param studentId the primary key of the student entry
	 * @return the student entry
	 * @throws net.service.builder.NoSuchEntryException if a student entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public StudentEntry findByPrimaryKey(long studentId)
		throws NoSuchEntryException, SystemException {
		StudentEntry studentEntry = fetchByPrimaryKey(studentId);

		if (studentEntry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + studentId);
			}

			throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				studentId);
		}

		return studentEntry;
	}

	/**
	 * Returns the student entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the student entry
	 * @return the student entry, or <code>null</code> if a student entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentEntry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the student entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student entry
	 * @return the student entry, or <code>null</code> if a student entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public StudentEntry fetchByPrimaryKey(long studentId)
		throws SystemException {
		StudentEntry studentEntry = (StudentEntry)EntityCacheUtil.getResult(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
				StudentEntryImpl.class, studentId);

		if (studentEntry == _nullStudentEntry) {
			return null;
		}

		if (studentEntry == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				studentEntry = (StudentEntry)session.get(StudentEntryImpl.class,
						Long.valueOf(studentId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (studentEntry != null) {
					cacheResult(studentEntry);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(StudentEntryModelImpl.ENTITY_CACHE_ENABLED,
						StudentEntryImpl.class, studentId, _nullStudentEntry);
				}

				closeSession(session);
			}
		}

		return studentEntry;
	}

	/**
	 * Returns all the student entries.
	 *
	 * @return the student entries
	 * @throws SystemException if a system exception occurred
	 */
	public List<StudentEntry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the student entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of student entries
	 * @param end the upper bound of the range of student entries (not inclusive)
	 * @return the range of student entries
	 * @throws SystemException if a system exception occurred
	 */
	public List<StudentEntry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the student entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of student entries
	 * @param end the upper bound of the range of student entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of student entries
	 * @throws SystemException if a system exception occurred
	 */
	public List<StudentEntry> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<StudentEntry> list = (List<StudentEntry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STUDENTENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENTENTRY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<StudentEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<StudentEntry>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the student entries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (StudentEntry studentEntry : findAll()) {
			remove(studentEntry);
		}
	}

	/**
	 * Returns the number of student entries.
	 *
	 * @return the number of student entries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STUDENTENTRY);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the student entry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.service.builder.model.StudentEntry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StudentEntry>> listenersList = new ArrayList<ModelListener<StudentEntry>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<StudentEntry>)InstanceFactory.newInstance(
							clazz.getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(StudentEntryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = StudentEntryPersistence.class)
	protected StudentEntryPersistence studentEntryPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_STUDENTENTRY = "SELECT studentEntry FROM StudentEntry studentEntry";
	private static final String _SQL_COUNT_STUDENTENTRY = "SELECT COUNT(studentEntry) FROM StudentEntry studentEntry";
	private static final String _ORDER_BY_ENTITY_ALIAS = "studentEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StudentEntry exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StudentEntryPersistenceImpl.class);
	private static StudentEntry _nullStudentEntry = new StudentEntryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StudentEntry> toCacheModel() {
				return _nullStudentEntryCacheModel;
			}
		};

	private static CacheModel<StudentEntry> _nullStudentEntryCacheModel = new CacheModel<StudentEntry>() {
			public StudentEntry toEntityModel() {
				return _nullStudentEntry;
			}
		};
}