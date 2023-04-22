var nodes = [
  { id: 1, label: "This is a\nsingle-font label", },
  {
    id: 2,
    font: { multi: true },
    label:
      "<b>This</b> is a\n<i>default</i> <b><i>multi-</i>font</b> <code>label</code>",
  },
  {
    id: 3,
    font: { multi: "html" },
    label:
      "<b>This</b> is an\n<i>html</i> <b><i>multi-</i>font</b> <code>label</code>",

  },
  {
    id: 4,
    font: { multi: "md", face: "georgia" },
    label: "*This* is a\n_markdown_ *_multi-_ font* `label`",

  },
  { id: 5, label: "This is a\nsingle-font label", },
  {
    id: 6,
    font: { multi: true },
    label:
      "<b>This</b> is a\n<i>default</i> <b><i>multi-</i>font</b> <code>label</code>",

  },
  {
    id: 7,
    font: { multi: "html" },
    label:
      "<b>This</b> is an\n<i>html</i> <b><i>multi-</i>font</b> <code>label</code>",
  },
  {
    id: 8,
    font: { multi: "md", face: "georgia" },
    label: "*This* is a\n_markdown_ *_multi-_ font* `label`",
  },
];

var edges = [
  { from: 1, to: 2, },
  { from: 2, to: 3, },
  { from: 3, to: 4, },
  { from: 5, to: 6, },
  { from: 6, to: 7, },
  { from: 7, to: 8, },
];

var container = document.getElementById("mynetwork");
var data = {
  nodes: nodes,
  edges: edges,
};
var options = {
  edges: {
    font: {
      size: 12,
    },
  },
  nodes: {
    color: "#FFFFFF",
    shape: "box",
    font: {
      bold: {
        color: "#0077aa",
      },
    },
  },
  physics: {
    enabled: false,
  },
  layout: {
    hierarchical: {
      direction: "UD",
    },
  },
};
var network = new vis.Network(container, data, options);
