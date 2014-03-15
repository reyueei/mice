<%@ page import="com.mice.Node" %>



<div class="fieldcontain ${hasErrors(bean: nodeInstance, field: 'label', 'error')} required">
	<label for="label">
		<g:message code="node.label.label" default="Label" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="label" required="" value="${nodeInstance?.label}"/>
</div>


