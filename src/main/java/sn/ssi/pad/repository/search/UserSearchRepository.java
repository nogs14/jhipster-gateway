package sn.ssi.pad.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import sn.ssi.pad.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
