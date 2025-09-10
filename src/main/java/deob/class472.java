package deob;

@ObfuscatedName("sc")
public class class472 extends class478 {

	public class472(class478 arg0) {
		super(arg0);
		this.field5304 = "SwapSongTask";
	}

	@ObfuscatedName("sc.af(B)Z")
	public boolean method8969() {
		if (class340.field3891.size() > 1 && class340.field3891.get(0) != null && ((class352) class340.field3891.get(0)).field4013.method6579() && class340.field3891.get(1) != null && ((class352) class340.field3891.get(1)).field4013.method6579()) {
			class352 var1 = (class352) class340.field3891.get(0);
			class340.field3891.set(0, class340.field3891.get(1));
			class340.field3891.set(1, var1);
		}
		return true;
	}
}
