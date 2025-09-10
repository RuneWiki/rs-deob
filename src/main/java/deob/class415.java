package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("pf")
public class class415 {

	@ObfuscatedName("pf.af")
	public static Comparator field5012 = new class418();

	@ObfuscatedName("pf.aw")
	public static Comparator field5013;

	@ObfuscatedName("pf.at")
	public static Comparator field5014;

	@ObfuscatedName("pf.ac")
	public static Comparator field5016;

	@ObfuscatedName("pf.ap")
	public final List field5015;

	static {
		new class420();
		field5013 = new class423();
		field5014 = new class417();
		field5016 = new class416();
	}

	public class415(class591 arg0, boolean arg1) {
		int var3 = arg0.method10341();
		boolean var4 = arg0.method10339() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}
		int var6 = arg0.method10341();
		this.field5015 = new ArrayList(var6);
		for (int var7 = 0; var7 < var6; var7++) {
			this.field5015.add(new class421(arg0, var5, var3));
		}
	}

	@ObfuscatedName("pf.af(Ljava/util/Comparator;ZB)V")
	public void method7817(Comparator arg0, boolean arg1) {
		if (arg1) {
			Collections.sort(this.field5015, arg0);
		} else {
			Collections.sort(this.field5015, Collections.reverseOrder(arg0));
		}
	}
}
