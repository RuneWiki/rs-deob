package deob;

import java.util.Iterator;

@ObfuscatedName("vb")
public class class568 implements Iterator {

	// $FF: synthetic field
	public final class569 this$0;

	@ObfuscatedName("vb.af")
	public int field5806;

	public class568(class569 arg0) {
		this.this$0 = arg0;
	}

	public boolean hasNext() {
		return this.field5806 < this.this$0.method9666();
	}

	public Object next() {
		int var1 = ++this.field5806 - 1;
		class528 var2 = (class528) this.this$0.field5810.method6423((long) var1);
		return var2 == null ? this.this$0.method10137(var1) : var2;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
