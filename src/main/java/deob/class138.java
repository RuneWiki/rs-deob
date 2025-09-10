package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fy")
public class class138 implements Callable {

	// $FF: synthetic field
	public final class147 this$0;

	@ObfuscatedName("fy.af")
	public final class139 field1655;

	@ObfuscatedName("fy.aw")
	public final class140 field1652;

	@ObfuscatedName("fy.at")
	public final class141 field1651;

	@ObfuscatedName("fy.ac")
	public final int field1654;

	public class138(class147 arg0, class139 arg1, class140 arg2, class141 arg3, int arg4) {
		this.this$0 = arg0;
		this.field1655 = arg1;
		this.field1652 = arg2;
		this.field1651 = arg3;
		this.field1654 = arg4;
	}

	public Object call() {
		this.field1655.method3530();
		class139[][] var1;
		if (class140.field1683 == this.field1652) {
			var1 = this.this$0.field1738;
		} else {
			var1 = this.this$0.field1733;
		}
		var1[this.field1654][this.field1651.method3573()] = this.field1655;
		return null;
	}
}
