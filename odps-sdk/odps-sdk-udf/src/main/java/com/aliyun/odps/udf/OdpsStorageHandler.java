package com.aliyun.odps.udf;

/**
 * Recommended class (over {@link HiveStorageHandler}) to extend from for custom storage handler
 * This provides interfaces to reason about the Extractor/Outputer implemented by the user,
 * for converting raw byte stream into records and vice versa.
 **/
public abstract class OdpsStorageHandler implements BaseStorageHandler {

  /**
   * Getter for underlying extractor class
   * @return Class description for the extractor class
   **/
  @Override
  public abstract Class<? extends Extractor> getExtractorClass();

  /**
   * Getter for underlying outputer class
   * @return Class description for the outputer class
   **/
  @Override
  public abstract Class<? extends Outputer> getOutputerClass();

}
