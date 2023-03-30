package samseptiano.example.stopwatchapp

import junit.framework.Assert.assertEquals
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)

class CurrencyTest : TestCase() {

	var data = arrayListOf<String>()

	@Test
	fun checkThousandSeparator() {
		val amount = 1000
		var cur = Currency()
		val result = cur.thousandSeparator(amount)
		assertEquals(result, "1.000")
	}

	@Test
	@Throws(Exception::class)
	fun addition_isCorrect() {
		assertEquals(4, 2 + 2)
	}


	@Before
	fun initData(){
		data.add("one")
		data.add("two")
		data.add("three")
		data.add("four")
	}
	@Test
	@Throws(Exception::class)
	fun checkSorting() {
		var cur = Currency()
		var result = cur.sortedList(data)
		assertEquals(result, data)
	}

}
