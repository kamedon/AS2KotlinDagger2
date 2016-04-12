# AS2KotlinDagger2

##Android Studio2.0でKotlinでDagger2を使うサンプル

##error:
Error:Execution failed for task ':app:compileDebugJavaWithJavac'.
> java.lang.NoSuchMethodError: com.google.common.collect.ImmutableSetMultimap$Builder.putAll(Ljava/lang/Iterable;)Lcom/google/common/collect/ImmutableSetMultimap$Builder;

どうもAppComponentの
@Component(modules = {AppModule.class})
でエラーがでるようだ
