package com.clouway.oauth2.token;

import com.google.common.base.Optional;

/**
 * Tokens is responsible for issuing and retriving of issued tokens.
 *
 * @author Ivan Stefanov <ivan.stefanov@clouway.com>
 */
public interface Tokens {

  /**
   * Find token which is not expired till the provided time.
   *
   * @param token then token for which is looked
   * @return an optional token value or absent value if not present
   */
  Optional<Token> getNotExpiredToken(String token);

  /**
   * Refreshes token using the access token.
   *
   * @param token the access token
   * @return the refreshed token
   */
  Optional<Token> refreshToken(String token);

  /**
   * Issues a new token for the provided user.
   *
   * @param identityId     the identityId for which token is issued
   */
  Token issueToken(String identityId);
}