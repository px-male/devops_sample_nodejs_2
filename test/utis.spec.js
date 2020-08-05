const { math } = require('../src/utils')

describe('utils test', () => {
  describe('math test', () => {
    test('shoud be 3 when adding 1 and 2', () => {
      expect(math.add(1,2)).toBe(3);
    });

    test('shoud be -3 when subtracting 2 from 1', () =>
      expect(math.subtract(1, 2)).toBe(-1);
    });
  });
});

