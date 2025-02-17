package com.github.mustfun.mybatis.plugin.util;

import com.intellij.openapi.util.IconLoader;
import com.intellij.util.PlatformIcons;

import javax.swing.*;

/**
 * @author yanglin
 */
public interface Icons {

  Icon MYBATIS_LOGO = IconLoader.getIcon("/javaee/persistenceId.png");



  Icon PARAM_COMPLETION_ICON = PlatformIcons.PARAMETER_ICON;

  Icon MAPPER_LINE_MARKER_ICON = IconLoader.getIcon("/images/down.png");

  Icon STATEMENT_LINE_MARKER_ICON = IconLoader.getIcon("/images/up.png");

  Icon SPRING_INJECTION_ICON = IconLoader.getIcon("/images/showAutowiredDependencies.png");

  Icon MYBATIS_LOGO_MINI = IconLoader.getIcon("/images/logo_16.png");
}