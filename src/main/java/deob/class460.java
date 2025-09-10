package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("ru")
public class class460 implements Iterator {

	@ObfuscatedName("ru.af")
	public class461 field5213;

	@ObfuscatedName("ru.aw")
	public int field5212 = 0;

	@ObfuscatedName("ru.at")
	public int field5211 = this.field5213.field5215;

	public class460(class461 arg0) {
		this.field5213 = arg0;
	}

	public boolean hasNext() {
		return this.field5212 < this.field5213.field5217;
	}

	public Object next() {
		if (this.field5213.field5215 != this.field5211) {
			throw new ConcurrentModificationException();
		} else if (this.field5212 < this.field5213.field5217) {
			Object var1 = this.field5213.field5219[this.field5212].field5207;
			this.field5212++;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
