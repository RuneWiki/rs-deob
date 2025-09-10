package deob;

@ObfuscatedName("fm")
public class class148 implements class431 {

	@ObfuscatedName("fm.af")
	public static final class148 field1747 = new class148(0, 0);

	@ObfuscatedName("fm.aw")
	public static final class148 field1742 = new class148(1, 1);

	@ObfuscatedName("fm.at")
	public static final class148 field1743 = new class148(2, 2);

	@ObfuscatedName("fm.ac")
	public static final class148 field1744 = new class148(3, 3);

	@ObfuscatedName("fm.ap")
	public static final class148 field1745 = new class148(4, 4);

	@ObfuscatedName("fm.aq")
	public static final class148 field1748 = new class148(5, 5);

	@ObfuscatedName("fm.ao")
	public static final class148 field1746 = new class148(6, 6);

	@ObfuscatedName("fm.as")
	public static final class148 field1741 = new class148(7, 7);

	@ObfuscatedName("fm.al")
	public static final class148 field1749 = new class148(8, 8);

	@ObfuscatedName("fm.au")
	public final int field1750;

	@ObfuscatedName("fm.ai")
	public final int field1751;

	@ObfuscatedName("fu.at(B)[Lfm;")
	public static class148[] method3605() {
		return new class148[] { field1747, field1742, field1743, field1744, field1745, field1748, field1746, field1741, field1749 };
	}

	public class148(int arg0, int arg1) {
		this.field1750 = arg0;
		this.field1751 = arg1;
	}

	@ObfuscatedName("bk.ac(II)Lfm;")
	public static class148 method785(int arg0) {
		class148 var1 = (class148) class432.method3817(method3605(), arg0);
		if (var1 == null) {
			var1 = field1749;
		}
		return var1;
	}

	@ObfuscatedName("fm.af(I)I")
	public int method34() {
		return this.field1751;
	}
}
