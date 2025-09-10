package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bf")
public class class50 {

	@ObfuscatedName("bf.ai")
	public static final BigInteger field706 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@ObfuscatedName("bf.aa")
	public static final BigInteger field707 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	public class50() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("lx.af(JLjava/lang/String;I)I")
	public static final int method6270(long arg0, String arg1) {
		Random var3 = new Random();
		class591 var4 = new class591(128);
		class591 var5 = new class591(128);
		int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		var4.method10320(10);
		for (int var7 = 0; var7 < 4; var7++) {
			var4.method10547(var3.nextInt());
		}
		var4.method10547(var6[0]);
		var4.method10547(var6[1]);
		var4.method10325(arg0);
		var4.method10325(0L);
		for (int var8 = 0; var8 < 4; var8++) {
			var4.method10547(var3.nextInt());
		}
		var4.method10367(field706, field707);
		var5.method10320(10);
		for (int var9 = 0; var9 < 3; var9++) {
			var5.method10547(var3.nextInt());
		}
		var5.method10325(var3.nextLong());
		var5.method10427(var3.nextLong());
		client.method290(var5);
		var5.method10325(var3.nextLong());
		var5.method10367(field706, field707);
		int var10 = class591.method5971(arg1);
		if (var10 % 8 != 0) {
			var10 += 8 - var10 % 8;
		}
		class591 var11 = new class591(var10);
		var11.method10504(arg1);
		var11.field5920 = var10;
		var11.method10363(var6);
		class591 var12 = new class591(var11.field5920 + var5.field5920 + var4.field5920 + 5);
		var12.method10320(2);
		var12.method10320(var4.field5920);
		var12.method10330(var4.field5917, 0, var4.field5920);
		var12.method10320(var5.field5920);
		var12.method10330(var5.field5917, 0, var5.field5920);
		var12.method10321(var11.field5920);
		var12.method10330(var11.field5917, 0, var11.field5920);
		String var13 = Statics.method3767(var12.field5917);
		try {
			URL var14 = new URL(client.method4455("services", false) + "m=accountappeal/login.ws");
			URLConnection var15 = var14.openConnection();
			var15.setDoInput(true);
			var15.setDoOutput(true);
			var15.setConnectTimeout(5000);
			OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
			var16.write("data2=" + class616.method5112(var13) + "&dest=" + class616.method5112("passwordchoice.ws"));
			var16.flush();
			InputStream var17 = var15.getInputStream();
			class591 var18 = new class591(new byte[1000]);
			do {
				int var19 = var17.read(var18.field5917, var18.field5920, 1000 - var18.field5920);
				if (var19 == -1) {
					var16.close();
					var17.close();
					String var20 = new String(var18.field5917);
					if (var20.startsWith("OFFLINE")) {
						return 4;
					} else if (var20.startsWith("WRONG")) {
						return 7;
					} else if (var20.startsWith("RELOAD")) {
						return 3;
					} else if (var20.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var18.method10446(var6);
						while (var18.field5920 > 0 && var18.field5917[var18.field5920 - 1] == 0) {
							var18.field5920--;
						}
						String var21 = new String(var18.field5917, 0, var18.field5920);
						if (method3451(var21)) {
							class32.method325(var21, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}
				var18.field5920 += var19;
			} while (var18.field5920 < 1000);
			return 5;
		} catch (Throwable var23) {
			var23.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("ev.aw(Ljava/lang/String;B)Z")
	public static boolean method3451(String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (MalformedURLException var2) {
			return false;
		}
	}
}
