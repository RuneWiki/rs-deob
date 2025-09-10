package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("qy")
public class class434 implements class431 {

	@ObfuscatedName("qy.af")
	public static final class434 field5121 = new class434("", 0, new class430[] { class430.field5088, class430.field5089 });

	@ObfuscatedName("qy.aw")
	public static final class434 field5107 = new class434("", 1, new class430[] { class430.field5087, class430.field5088, class430.field5089 });

	@ObfuscatedName("qy.at")
	public static final class434 field5119 = new class434("", 2, new class430[] { class430.field5087, class430.field5086, class430.field5088 });

	@ObfuscatedName("qy.ac")
	public static final class434 field5108 = new class434("", 3, new class430[] { class430.field5087 });

	@ObfuscatedName("qy.ap")
	public static final class434 field5109 = new class434("", 4);

	@ObfuscatedName("qy.aq")
	public static final class434 field5111 = new class434("", 5, new class430[] { class430.field5087, class430.field5088 });

	@ObfuscatedName("qy.ao")
	public static final class434 field5112 = new class434("", 6, new class430[] { class430.field5088 });

	@ObfuscatedName("qy.as")
	public static final class434 field5113 = new class434("", 8, new class430[] { class430.field5087, class430.field5088 });

	@ObfuscatedName("qy.al")
	public static final class434 field5114 = new class434("", 9, new class430[] { class430.field5087, class430.field5086 });

	@ObfuscatedName("qy.au")
	public static final class434 field5115 = new class434("", 10, new class430[] { class430.field5087 });

	@ObfuscatedName("qy.ai")
	public static final class434 field5116 = new class434("", 11, new class430[] { class430.field5087 });

	@ObfuscatedName("qy.aa")
	public static final class434 field5110 = new class434("", 12, new class430[] { class430.field5087, class430.field5088 });

	@ObfuscatedName("qy.am")
	public static final class434 field5118 = new class434("", 13, new class430[] { class430.field5087 });

	@ObfuscatedName("qy.an")
	public final int field5106;

	@ObfuscatedName("qy.ar")
	public final Set field5120 = new HashSet();

	static {
		method8012();
	}

	@ObfuscatedName("qy.at(I)[Lqy;")
	public static class434[] method8012() {
		return new class434[] { field5115, field5121, field5113, field5119, field5111, field5108, field5118, field5109, field5116, field5114, field5110, field5107, field5112 };
	}

	public class434(String arg0, int arg1) {
		this.field5106 = arg1;
	}

	public class434(String arg0, int arg1, class430[] arg2) {
		this.field5106 = arg1;
		class430[] var4 = arg2;
		for (int var5 = 0; var5 < var4.length; var5++) {
			class430 var6 = var4[var5];
			this.field5120.add(var6);
		}
	}

	@ObfuscatedName("qy.af(I)I")
	public int method34() {
		return this.field5106;
	}
}
