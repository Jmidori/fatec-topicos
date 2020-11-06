package com.escola.disciplina.configuracao;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class JmsConfig {

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Value("${activemq.broker-username}")
    private String brokerUsername;

    @Value("${activemq.broker-password}")
    private String brokerPassword;

    @Bean
    public ActiveMQConnectionFactory receiverActiveMQConnectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerUrl);
        activeMQConnectionFactory.setUserName(brokerUsername);
        activeMQConnectionFactory.setPassword(brokerPassword);

        return activeMQConnectionFactory;
    }

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(receiverActiveMQConnectionFactory());
        factory.setPubSubDomain(true);
        factory.setSubscriptionDurable(true);
        factory.setClientId("api-disciplina");

        return factory;
    }
}
