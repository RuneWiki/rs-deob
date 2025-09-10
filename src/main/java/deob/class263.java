package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("kn")
public class class263 {

	@ObfuscatedName("kn.af")
	public static boolean field3116 = false;

	@ObfuscatedName("kn.at")
	public static Hashtable field3117 = new Hashtable(16);

	public class263() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("hx.af(Ljava/lang/String;I)Ljava/io/File;")
	public static File method4092(String arg0) {
		if (!field3116) {
			throw new RuntimeException("");
		}
		File var1 = (File) field3117.get(arg0);
		if (var1 != null) {
			return var1;
		}
		File var2 = new File(Statics.field3118, arg0);
		RandomAccessFile var3 = null;
		try {
			File var4 = new File(var2.getParent());
			if (!var4.exists()) {
				throw new RuntimeException("");
			}
			var3 = new RandomAccessFile(var2, "rw");
			int var5 = var3.read();
			var3.seek(0L);
			var3.write(var5);
			var3.seek(0L);
			var3.close();
			field3117.put(arg0, var2);
			return var2;
		} catch (Exception var10) {
			try {
				if (var3 != null) {
					var3.close();
					Object var7 = null;
				}
			} catch (Exception var9) {
			}
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hp.aw(I)V")
	public static void method4019() {
		field3117.clear();
	}
}
