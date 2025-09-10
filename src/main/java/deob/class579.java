package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("wd")
public class class579 extends class541 {

	@ObfuscatedName("wd.ac")
	public class575[] field5833;

	@ObfuscatedName("wd.ap")
	public List field5837;

	public class579(class413 arg0, int arg1, int arg2) {
		byte[] var4 = arg0.method7692(arg1, arg2 + 1);
		this.method10207(new class591(var4));
	}

	public class579(class413 arg0, int arg1) {
		byte[] var3 = arg0.method7692(arg1, 0);
		this.method10207(new class591(var3));
	}

	@ObfuscatedName("wd.af(Lwb;B)V")
	public void method10207(class591 arg0) {
		int var2 = arg0.method10361();
		this.field5833 = new class575[var2];
		this.field5837 = new ArrayList(var2);
		for (int var3 = 0; var3 < var2; var3++) {
			this.field5833[var3] = (class575) class432.method3817(class575.method10175(), arg0.method10339());
			int var4 = arg0.method10361();
			HashMap var5 = new HashMap(var4);
			while (var4-- > 0) {
				Object var6 = this.field5833[var3].method10173(arg0);
				int var7 = arg0.method10361();
				ArrayList var8 = new ArrayList();
				while (var7-- > 0) {
					int var9 = arg0.method10361();
					var8.add(var9);
				}
				var5.put(var6, var8);
			}
			this.field5837.add(var3, var5);
		}
	}

	@ObfuscatedName("wd.aw(Ljava/lang/Object;IB)Ljava/util/List;")
	public List method10206(Object arg0, int arg1) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		Map var3 = (Map) this.field5837.get(arg1);
		return (List) var3.get(arg0);
	}
}
