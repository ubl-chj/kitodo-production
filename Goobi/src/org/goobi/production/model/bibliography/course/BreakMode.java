/**
 * This file is part of the Goobi Application - a Workflow tool for the support
 * of mass digitization.
 * 
 * (c) 2013 Goobi. Digialisieren im Verein e.V. &lt;contact@goobi.org&gt;
 * 
 * Visit the websites for more information.
 *     		- http://www.goobi.org/en/
 *     		- https://github.com/goobi
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the
 * GNU General Public License cover the whole combination. As a special
 * exception, the copyright holders of this library give you permission to link
 * this library with independent modules to produce an executable, regardless of
 * the license terms of these independent modules, and to copy and distribute
 * the resulting executable under terms of your choice, provided that you also
 * meet, for each linked independent module, the terms and conditions of the
 * license of that module. An independent module is a module which is not
 * derived from or based on this library. If you modify this library, you may
 * extend this exception to your version of the library, but you are not obliged
 * to do so. If you do not wish to do so, delete this exception statement from
 * your version.
 */

package org.goobi.production.model.bibliography.course;

/**
 * The BreakMode indicates one out of four options how a course of appearance of
 * a newspaper can be broken into processes. These are as follows:
 * 
 * <dl>
 * <dt>ISSUES</dt>
 * <dd>Each issue is scanned in an individual process.</dd>
 * <dt>DAYS</dt>
 * <dd>All issues of one day are scanned in one process.</dd>
 * <dt>WEEKS</dt>
 * <dd>All issues of a week are scanned in one process. A week starts on
 * Mondays. Keep in mind that week borders do not necessarily match month and
 * not even year borders.</dd>
 * <dt>MONTHS</dt>
 * <dd>All issues of a month are scanned in one process.</dd>
 * <dt>YEARS</dt>
 * <dd>All issues of a year are scanned in one process.</dd>
 * </dl>
 * 
 * @author Matthias Ronge &lt;matthias.ronge@zeutschel.de&gt;
 */
public enum BreakMode {
	ISSUES, DAYS, WEEKS, MONTHS, YEARS
}
