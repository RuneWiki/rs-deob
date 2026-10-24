package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.graphics.Model;

@ObfuscatedName("cb")
public class LocEntity extends Entity {

	@ObfuscatedName("cb.n")
	public int field443;

	@ObfuscatedName("cb.o")
	public int field444;

	@ObfuscatedName("cb.p")
	public int field445;

	@ObfuscatedName("cb.q")
	public int field446;

	@ObfuscatedName("cb.r")
	public int field447;

	@ObfuscatedName("cb.s")
	public int field448;

	@ObfuscatedName("cb.t")
	public int field449;

	@ObfuscatedName("cb.u")
	public SeqType field450;

	@ObfuscatedName("cb.v")
	public int field451;

	@ObfuscatedName("cb.w")
	public int field452;

	public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
		field443 = arg7;
		field444 = arg3;
		field445 = arg4;
		field446 = arg2;
		field447 = arg6;
		field448 = arg1;
		field449 = arg0;
		field450 = SeqType.field973[arg8];
		field451 = 0;
		field452 = Client.field1385;
		if (arg5 && field450.field978 != -1) {
			field451 = (int) (Math.random() * field450.field974);
			field452 -= (int) (Math.random() * field450.method382(field451));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final Model method122() {
		if (field450 != null) {
			int var1 = Client.field1385 - field452;
			if (var1 > 100 && field450.field978 > 0) {
				var1 = 100;
			}

			while (var1 > field450.method382(field451)) {
				var1 -= field450.method382(field451);
				field451++;
				if (field451 >= field450.field974) {
					field451 -= field450.field978;
					if (field451 < 0 || field451 >= field450.field974) {
						break;
					}
				}
			}

			field450 = null;
			field452 = Client.field1385 - var1;
		}

		int var2 = -1;
		if (field450 != null) {
			var2 = field450.field975[field451];
		}

		LocType var3 = LocType.method333(field443);
		return var3.method339(field444, field445, field446, field447, field448, field449, var2);
	}
}
