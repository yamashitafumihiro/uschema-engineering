define([], function() {
	var keywords = "AFTER|AGGR|ANY|BEFORE|BETWEEN|ENTITY|FROM|KEYS|ONLY|REF|REL|TO|_|boolean|number|string";
	return {
		id: "xtext.skiql",
		contentTypes: ["xtext/skiql"],
		patterns: [
			{include: "orion.c-like#comment_singleLine"},
			{include: "orion.c-like#comment_block"},
			{include: "orion.lib#string_doubleQuote"},
			{include: "orion.lib#string_singleQuote"},
			{include: "orion.lib#number_decimal"},
			{include: "orion.lib#brace_open"},
			{include: "orion.lib#brace_close"},
			{include: "orion.lib#bracket_open"},
			{include: "orion.lib#bracket_close"},
			{include: "orion.lib#parenthesis_open"},
			{include: "orion.lib#parenthesis_close"},
			{name: "keyword.skiql", match: "\\b(?:" + keywords + ")\\b"}
		]
	};
});
