/**
 * Base package for CDI based controllers for JSF views.
 * For each view folder under webapp/views/ there must be a 
 * controller for corresponding to each view file under that folder.
 * The controller's name will be the name of the folder plus the
 * name of the page he controls plus "Controller" sufix.
 * For example, if there is webapp/views/user/index.xhtml
 * then there must be the package kell.systemplate.jsfmodule.web.jsf.controller
 * and the controller UserIndexController under that package.
 * The sufix of the managed name of the controller will be Ctrl.
 * The preferred scope for controllers is ViewScope.
 * Example: 

@ViewScoped
@Named("userIndexCtrl")
public lass UserIndexController implements Serializable {
} 

 */
/**
 * @author kellsaro@gmail.com
 *
 */
package kell.systemplate.jsfmodule.web.jsf.controller;