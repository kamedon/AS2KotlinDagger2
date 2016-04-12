# AS2KotlinDagger2

##Android Studio2.0でKotlinでDagger2を使うサンプル

##error:

>Error:Execution failed for task ':app:compileDebugJavaWithJavac'.
>java.lang.NoSuchMethodError: com.google.common.collect.ImmutableSetMultimap$Builder.putAll(Ljava/lang/Iterable;)Lcom/google/common/collect/ImmutableSetMultimap$Builder;

どうもAppComponentの
@Component(modules = {AppModule.class})
でエラーがでるようだ

どうも、daggar2.2 -> 2.3 の時に発生したエラーのようだ。。。
https://github.com/google/dagger/issues/356
