package sanmokunarabe_final;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Cell_unitTest {
	Cell cell;

	@Test
	public void getMark_1_1() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.CIRCLE);
		Mark actual = cell.getMark();
		Mark expectedResult = Mark.CIRCLE;
		assertThat(actual, is(expectedResult));
	}

	@Test
	public void getMark_1_2() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.CROSS);
		Mark actual = cell.getMark();
		Mark expectedResult = Mark.CROSS;
		assertThat(actual, is(expectedResult));
	}

	@Test
	public void getMark_1_3() {
		Cell cell = new Cell(1, 1);
		Mark actual = cell.getMark();
		Mark expectedResult = Mark.NONE;
		assertThat(actual, is(expectedResult));
	}

	@Test
	public void isCellFull_2_1() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.CIRCLE);
		boolean actual = cell.isCellFull();
		boolean expectedResult = false;
		assertThat(actual, is(expectedResult));
	}

	@Test
	public void isCellFull_2_2() {
		Cell cell = new Cell(1, 1);
		boolean actual = cell.isCellFull();
		boolean expectedResult = true;
		assertThat(actual, is(expectedResult));
	}

	@Test
	public void changeMark_3_1() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.CIRCLE);
		String actual = cell.changeMark();
		String expectedResult = "○";
		assertThat(actual, is(expectedResult));
	}

	@Test
	public void changeMark_3_2() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.CROSS);
		String actual = cell.changeMark();
		String expectedResult = "×";
		assertThat(actual, is(expectedResult));
	}
}