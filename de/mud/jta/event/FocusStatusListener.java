/*
 * This file is part of "The Java Telnet Application".
 *
 * (c) Matthias L. Jugel, Marcus Mei�ner 1996-2002. All Righs Reserved.
 *
 * The software is licensed under the terms and conditions in the
 * license agreement included in the software distribution package.
 *
 * You should have received a copy of the license along with this
 * software; see the file license.txt. If not, navigate to the 
 * URL http://javatelnet.org/ and view the "License Agreement".
 *
 */
package de.mud.jta.event;

import de.mud.jta.Plugin;
import de.mud.jta.PluginListener;

import java.awt.Dimension;

/**
 * This is the interface for a focus status listener.
 * <P>
 * <B>Maintainer:</B> Matthias L. Jugel
 *
 * @version $Id$
 * @author Matthias L. Jugel, Marcus Mei�ner
 */
public interface FocusStatusListener extends PluginListener {
  /** Called if a plugin gained the input focus. */
  public void pluginGainedFocus(Plugin plugin);
  /** Called if a plugin lost the input focus. */
  public void pluginLostFocus(Plugin plugin);
}
