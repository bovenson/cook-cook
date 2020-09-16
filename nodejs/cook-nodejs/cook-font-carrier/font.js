const fs = require('fs');
const fontCarrier = require('font-carrier');
const font = fontCarrier.create();
// font.setSvg('test', fs.readFileSync('test.svg').toString());
font.setGlyph('1', {
    glyphName: '1',
    horizAdvX: '1024',
    svg: fs.readFileSync('src/1.svg').toString()
});

font.setGlyph('2', {
    glyphName: '2',
    horizAdvX: '1024',
    svg: fs.readFileSync('src/2.svg').toString()
});

font.setGlyph('test', {
    glyphName: 'test',
    horizAdvX: '1024',
    svg: fs.readFileSync('src/test.svg').toString()
});

// var svg = font.getSvg('test');
font.output({
    path: './output/test'
});

console.log(font.getGlyph('2').options.d);
