//package cn.lind.config;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//import org.springframework.context.annotation.Import;
//
//import com.alibaba.nacos.api.annotation.NacosProperties;
//import com.alibaba.nacos.spring.context.annotation.config.NacosConfigBeanDefinitionRegistrar;
//
//@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Import(NacosConfigBeanDefinitionRegistrar.class)
//public @interface EnableNacosConfig {
//    NacosProperties globalProperties() default
//            @NacosProperties(
//                    endpoint = ENDPOINT_PLACEHOLDER,
//                    namespace = NAMESPACE_PLACEHOLDER,
//                    accessKey = ACCESS_KEY_PLACEHOLDER,
//                    secretKey = SECRET_KEY_PLACEHOLDER,
//                    serverAddr = SERVER_ADDR_PLACEHOLDER,
//                    contextPath = CONTEXT_PATH_PLACEHOLDER,
//                    clusterName = CLUSTER_NAME_PLACEHOLDER,
//                    encode = ENCODE_PLACEHOLDER,
//                    configLongPollTimeout = CONFIG_LONG_POLL_TIMEOUT_PLACEHOLDER,
//                    configRetryTime = CONFIG_RETRY_TIME_PLACEHOLDER,
//                    maxRetry = MAX_RETRY_PLACEHOLDER
//            );
//}
