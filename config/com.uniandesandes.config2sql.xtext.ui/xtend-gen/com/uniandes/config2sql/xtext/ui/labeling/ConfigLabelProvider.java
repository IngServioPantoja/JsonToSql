/**
 * generated by Xtext
 */
package com.uniandes.config2sql.xtext.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class ConfigLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public ConfigLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
