// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: code_interpreter.proto

package com.github.crob1140.codewiz.battles;

public interface BattleDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BattleDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string code_id = 1;</code>
   */
  java.lang.String getCodeId();
  /**
   * <code>optional string code_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCodeIdBytes();

  /**
   * <code>optional .Contestant self = 2;</code>
   */
  boolean hasSelf();
  /**
   * <code>optional .Contestant self = 2;</code>
   */
  com.github.crob1140.codewiz.battles.Contestant getSelf();
  /**
   * <code>optional .Contestant self = 2;</code>
   */
  com.github.crob1140.codewiz.battles.ContestantOrBuilder getSelfOrBuilder();

  /**
   * <code>repeated .Contestant other_contestants = 3;</code>
   */
  java.util.List<com.github.crob1140.codewiz.battles.Contestant> 
      getOtherContestantsList();
  /**
   * <code>repeated .Contestant other_contestants = 3;</code>
   */
  com.github.crob1140.codewiz.battles.Contestant getOtherContestants(int index);
  /**
   * <code>repeated .Contestant other_contestants = 3;</code>
   */
  int getOtherContestantsCount();
  /**
   * <code>repeated .Contestant other_contestants = 3;</code>
   */
  java.util.List<? extends com.github.crob1140.codewiz.battles.ContestantOrBuilder> 
      getOtherContestantsOrBuilderList();
  /**
   * <code>repeated .Contestant other_contestants = 3;</code>
   */
  com.github.crob1140.codewiz.battles.ContestantOrBuilder getOtherContestantsOrBuilder(
      int index);

  /**
   * <code>optional .BattleDetails.JavaSpecifics java_specifics = 4;</code>
   */
  com.github.crob1140.codewiz.battles.BattleDetails.JavaSpecifics getJavaSpecifics();
  /**
   * <code>optional .BattleDetails.JavaSpecifics java_specifics = 4;</code>
   */
  com.github.crob1140.codewiz.battles.BattleDetails.JavaSpecificsOrBuilder getJavaSpecificsOrBuilder();

  public com.github.crob1140.codewiz.battles.BattleDetails.LanguageSpecificsCase getLanguageSpecificsCase();
}