package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

public class StoryPatternObjectConstraintViolatedNotification<StoryPatternObject, Classifier, Expression> extends
		InterpreterNotification<Classifier>
{
	private final Expression			constraint;
	private final StoryPatternObject	storyPatternObject;

	public StoryPatternObjectConstraintViolatedNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier, Expression constraint, StoryPatternObject storyPatternObject)
	{
		super(NotificationTypeEnum.STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED, variablesScope, notifier);

		this.constraint = constraint;
		this.storyPatternObject = storyPatternObject;
	}

	public Expression getConstraint()
	{
		return this.constraint;
	}

	public StoryPatternObject getStoryPatternObject()
	{
		return this.storyPatternObject;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.constraint;
	}
}
