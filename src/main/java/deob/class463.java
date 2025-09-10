package deob;

import java.util.ArrayList;

@ObfuscatedName("rb")
public class class463 {

	@ObfuscatedName("rb.ae")
	public int field5228 = Integer.MAX_VALUE;

	@ObfuscatedName("rb.ay")
	public int field5226 = Integer.MAX_VALUE;

	@ObfuscatedName("rb.ad")
	public int field5235 = 0;

	@ObfuscatedName("rb.ag")
	public int field5231 = 0;

	@ObfuscatedName("rb.av")
	public int field5232 = 0;

	@ObfuscatedName("rb.ah")
	public boolean field5233 = true;

	@ObfuscatedName("rb.ab")
	public class466 field5229;

	@ObfuscatedName("rb.ax")
	public ArrayList field5230 = new ArrayList();

	@ObfuscatedName("rb.ak")
	public int field5237 = 0;

	@ObfuscatedName("rb.aj")
	public int field5221 = 0;

	@ObfuscatedName("rb.af(II)Lrx;")
	public class465 method8726(int arg0) {
		return (class465) this.field5230.get(arg0);
	}

	@ObfuscatedName("rb.aw(B)Lrx;")
	public class465 method8612() {
		return this.field5230.isEmpty() ? null : (class465) this.field5230.get(this.field5230.size() - 1);
	}

	@ObfuscatedName("rb.at(B)Z")
	public boolean method8682() {
		return this.field5230.isEmpty();
	}

	@ObfuscatedName("rb.ac(S)Z")
	public boolean method8614() {
		return this.field5226 > 1;
	}

	@ObfuscatedName("rb.ap(B)I")
	public int method8719() {
		return this.field5230.size();
	}

	@ObfuscatedName("rb.aq(I)Ljava/lang/String;")
	public String method8673() {
		if (this.method8682()) {
			return "";
		}
		StringBuilder var1 = new StringBuilder(this.method8719());
		for (int var2 = 0; var2 < this.method8719(); var2++) {
			class465 var3 = this.method8726(var2);
			var1.append(var3.field5243);
		}
		return var1.toString();
	}

	@ObfuscatedName("rb.ao(IB)V")
	public void method8617(int arg0) {
		if (this.field5221 != arg0) {
			this.field5221 = arg0;
			this.method8733();
		}
	}

	@ObfuscatedName("rb.as(Lri;I)V")
	public void method8697(class466 arg0) {
		if (this.field5229 == arg0) {
			return;
		}
		this.field5229 = arg0;
		if (this.field5229 == null) {
			return;
		}
		if (this.field5232 == 0) {
			this.field5232 = this.field5229.field5252;
		}
		if (!this.method8682()) {
			this.method8733();
		}
	}

	@ObfuscatedName("rb.al(III)Z")
	public boolean method8619(int arg0, int arg1) {
		if (this.field5235 != arg0 || this.field5231 != arg1) {
			this.field5235 = arg0;
			this.field5231 = arg1;
			this.method8733();
		}
		return true;
	}

	@ObfuscatedName("rb.au(IB)V")
	public void method8620(int arg0) {
		if (this.field5232 != arg0) {
			this.field5232 = arg0;
			this.method8733();
		}
	}

	@ObfuscatedName("rb.ai(III)Lrh;")
	public class467 method8621(int arg0, int arg1) {
		if (arg0 == arg1) {
			return new class467(this, 0, 0);
		} else if (arg0 <= this.field5230.size() && arg1 <= this.field5230.size()) {
			return arg1 < arg0 ? new class467(this, arg1, arg0) : new class467(this, arg0, arg1);
		} else {
			return new class467(this, 0, 0);
		}
	}

	@ObfuscatedName("rb.aa(CIIB)Lrs;")
	public class464 method8611(char arg0, int arg1, int arg2) {
		return this.method8623(Character.toString(arg0), arg1, arg2);
	}

	@ObfuscatedName("rb.am(Ljava/lang/String;IIB)Lrs;")
	public class464 method8623(String arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			arg2 = Integer.MAX_VALUE;
		}
		int var4 = arg1;
		if (this.field5230.size() >= arg2) {
			this.method8660(arg1, arg1);
			return new class464(arg1, true);
		}
		this.field5230.ensureCapacity(this.field5230.size() + arg0.length());
		for (int var5 = 0; var5 < arg0.length() && this.field5230.size() < arg2; var5++) {
			class465 var6 = new class465();
			var6.field5243 = arg0.charAt(var5);
			this.field5230.add(var4, var6);
			var4++;
		}
		this.method8660(arg1, var4);
		if (this.field5226 == 0 || this.method8709() <= this.field5226) {
			return new class464(var4, false);
		}
		while (arg1 != var4) {
			var4--;
			this.method8610(var4);
			if (this.method8709() <= this.field5226) {
				break;
			}
		}
		return new class464(var4, true);
	}

	@ObfuscatedName("rb.an(Ljava/lang/String;II)Lrs;")
	public class464 method8624(String arg0, int arg1) {
		return this.method8623(arg0, this.field5230.size(), arg1);
	}

	@ObfuscatedName("rb.ar(Ljava/lang/String;I)Lrs;")
	public class464 method8724(String arg0) {
		this.method8626();
		return this.method8624(arg0, 0);
	}

	@ObfuscatedName("rb.ae(I)V")
	public void method8626() {
		this.field5230.clear();
	}

	@ObfuscatedName("rb.ay(II)I")
	public int method8610(int arg0) {
		return this.method8628(arg0, arg0 + 1);
	}

	@ObfuscatedName("rb.ad(IIB)I")
	public int method8628(int arg0, int arg1) {
		if (arg1 < arg0) {
			int var3 = arg1;
			arg1 = arg0;
			arg0 = var3;
		}
		this.field5230.subList(arg0, arg1).clear();
		int var4 = arg0;
		if (this.method8614() && this.field5237 == 1) {
			while (var4 > 0) {
				var4--;
				char var5 = ((class465) this.field5230.get(var4)).field5243;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}
		this.method8660(var4, arg1);
		return arg0;
	}

	@ObfuscatedName("rb.ag(IIB)I")
	public int method8629(int arg0, int arg1) {
		if (this.field5229 == null) {
			return 0;
		} else if (this.method8614() && arg0 > this.field5228) {
			return this.field5230.size();
		} else {
			if (!this.field5230.isEmpty()) {
				for (int var3 = 0; var3 < this.field5230.size(); var3++) {
					class465 var4 = (class465) this.field5230.get(var3);
					if (arg1 <= var4.field5245 + this.method8633()) {
						if (arg1 < var4.field5245) {
							break;
						}
						if (arg0 < var4.field5242) {
							return var3 > 0 ? var3 - 1 : 0;
						}
						if (var3 + 1 != this.field5230.size() && ((class465) this.field5230.get(var3 + 1)).field5245 != var4.field5245) {
							int var5 = this.method8648((class465) this.field5230.get(var3), false);
							if (arg0 < var4.field5242 + var5) {
								return var3;
							}
							if (arg1 <= var4.field5245 + this.method8633()) {
								return var3 + 1;
							}
						}
					}
				}
				class465 var6 = (class465) this.field5230.get(this.field5230.size() - 1);
				if (arg0 >= var6.field5242 && arg0 <= var6.field5242 + this.method8635() && arg1 >= var6.field5245 && arg1 <= var6.field5245 + this.method8633()) {
					return this.field5230.size() - 1;
				}
			}
			return this.field5230.size();
		}
	}

	@ObfuscatedName("rb.av(IIB)I")
	public int method8695(int arg0, int arg1) {
		if (this.field5229 == null || this.method8682() || arg0 > this.field5230.size()) {
			return 0;
		}
		byte var3;
		if (arg1 > 0) {
			var3 = 1;
		} else {
			var3 = -1;
			arg1 = -arg1;
		}
		int var4 = 0;
		int var5 = 0;
		if (arg0 > 0) {
			class465 var6 = (class465) this.field5230.get(arg0 - 1);
			var4 = var6.field5242 + this.method8647(arg0 - 1);
			var5 = var6.field5245;
		} else if (var3 == -1 && arg0 == 0) {
			return 0;
		}
		int var7 = 16777215;
		int var8 = 0;
		int var9 = arg0;
		int var10 = 16777215;
		int var11 = var3 == 1 ? this.field5230.size() + 1 : 0;
		for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
			class465 var13 = (class465) this.field5230.get(var12 - 1);
			if (var13.field5245 != var5) {
				var8++;
				var5 = var13.field5245;
				if (var8 > arg1) {
					return var9;
				}
			}
			if (arg1 == var8) {
				int var14 = Math.abs(var13.field5242 + this.method8647(var12 - 1) - var4);
				if (var14 >= var10) {
					return var9;
				}
				var9 = var12;
				var10 = var14;
			}
		}
		if (var3 == 1) {
			return this.field5230.size();
		} else {
			if (var5 != 0) {
				var8++;
			}
			return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
		}
	}

	@ObfuscatedName("rb.ah(I)I")
	public int method8652() {
		if (!this.field5230.isEmpty() && this.method8709() == 1) {
			return this.field5230.isEmpty() ? 0 : ((class465) this.field5230.get(this.field5230.size() - 1)).field5242 + this.method8635();
		}
		int var1 = -1;
		int var2 = 0;
		for (int var3 = this.field5230.size() - 1; var3 >= 0; var3--) {
			class465 var4 = (class465) this.field5230.get(var3);
			if (var4.field5245 != var1) {
				int var5 = this.method8648(var4, false) + var4.field5242;
				var2 = Math.max(var5, var2);
				var1 = var4.field5245;
			}
		}
		return var2;
	}

	@ObfuscatedName("rb.ab(B)I")
	public int method8632() {
		return this.method8682() ? 0 : this.field5229.field5252 + ((class465) this.field5230.get(this.field5230.size() - 1)).field5245;
	}

	@ObfuscatedName("rb.ax(B)I")
	public int method8633() {
		return this.field5232;
	}

	@ObfuscatedName("rb.ak(B)I")
	public int method8709() {
		return this.method8632() / this.field5229.field5252;
	}

	@ObfuscatedName("rb.aj(I)I")
	public int method8635() {
		return this.method8682() ? 0 : this.method8648((class465) this.field5230.get(this.field5230.size() - 1), false);
	}

	@ObfuscatedName("rb.az(I)I")
	public int method8636() {
		return this.field5228;
	}

	@ObfuscatedName("rb.bt(II)V")
	public void method8637(int arg0) {
		if (this.field5229 != null && arg0 < this.field5229.field5252 * 2) {
			arg0 = Integer.MAX_VALUE;
		}
		if (this.field5228 != arg0) {
			this.field5228 = arg0;
			this.method8733();
		}
	}

	@ObfuscatedName("rb.bs(I)I")
	public int method8670() {
		return this.field5226;
	}

	@ObfuscatedName("rb.bu(II)V")
	public void method8644(int arg0) {
		if (this.field5226 != arg0) {
			this.field5226 = arg0;
			this.method8733();
		}
	}

	@ObfuscatedName("rb.bi(I)I")
	public int method8640() {
		return this.field5237;
	}

	@ObfuscatedName("rb.bd(II)V")
	public void method8701(int arg0) {
		if (this.field5237 != arg0) {
			this.field5237 = arg0;
			this.method8733();
		}
	}

	@ObfuscatedName("rb.ba(I)I")
	public int method8631() {
		return this.field5221;
	}

	@ObfuscatedName("rb.bb(II)I")
	public int method8643(int arg0) {
		switch(this.field5235) {
			case 0:
				return 0;
			case 1:
				return arg0 / 2;
			case 2:
				return arg0;
			default:
				return 0;
		}
	}

	@ObfuscatedName("rb.bo(II)I")
	public int method8642(int arg0) {
		switch(this.field5231) {
			case 0:
				return 0;
			case 1:
				return arg0 / 2;
			case 2:
				return arg0;
			default:
				return 0;
		}
	}

	@ObfuscatedName("rb.bl(I)V")
	public void method8733() {
		this.method8660(0, this.field5230.size());
	}

	@ObfuscatedName("rb.by(III)V")
	public void method8660(int arg0, int arg1) {
		if (this.method8682() || this.field5229 == null) {
			return;
		}
		class558 var3 = this.method8649(arg0, arg1);
		boolean var4 = (Integer) var3.field5758 == 0 && (Integer) var3.field5757 == this.field5230.size();
		int var5 = (Integer) var3.field5758;
		int var6 = 0;
		int var7 = var4 ? 0 : ((class465) this.field5230.get((Integer) var3.field5758)).field5245;
		int var8 = 0;
		for (int var9 = (Integer) var3.field5758; var9 <= (Integer) var3.field5757; var9++) {
			boolean var10 = var9 >= this.field5230.size();
			class465 var11 = (class465) this.field5230.get(var10 ? this.field5230.size() - 1 : var9);
			int var12 = var10 ? 0 : this.method8648(var11, false);
			boolean var13 = !var10 && var11.field5243 == '\n';
			boolean var14 = !var10 && this.method8614() && var6 + var12 > this.field5228;
			if (var13 || var14 || var10) {
				int var15 = var9;
				int var16 = 0;
				if (var14) {
					int var17 = 0;
					if (this.field5237 == 1) {
						for (int var18 = var9; var18 > var5; var18--) {
							class465 var19 = (class465) this.field5230.get(var18);
							var17 += var18 < var15 ? this.method8648(var19, false) : 0;
							if (var19.field5243 == ' ' || var19.field5243 == '\n') {
								var15 = var18;
								var6 -= var17;
								var16 = var17;
								break;
							}
						}
					}
				}
				int var20 = -this.method8643(var6);
				for (int var21 = var5; var21 < var15; var21++) {
					class465 var22 = (class465) this.field5230.get(var21);
					int var23 = this.method8648(var22, false);
					var22.field5242 = var20;
					var22.field5245 = var7;
					var20 += var23;
				}
				var5 = var15;
				var6 = var16;
				var7 += this.method8633();
				var8++;
			}
			var6 += var10 ? 0 : var12;
		}
		if (this.field5231 == 0 || !var4) {
			return;
		}
		int var24 = var8 * this.method8633();
		int var25 = this.method8642(var24);
		for (int var26 = 0; var26 < this.field5230.size(); var26++) {
			class465 var27 = (class465) this.field5230.get(var26);
			var27.field5245 -= var25;
		}
	}

	@ObfuscatedName("rb.bg(II)I")
	public int method8647(int arg0) {
		return arg0 < this.field5230.size() ? this.method8648((class465) this.field5230.get(arg0), false) : 0;
	}

	@ObfuscatedName("rb.bx(Lrx;ZB)I")
	public int method8648(class465 arg0, boolean arg1) {
		if (arg0.field5243 == '\n') {
			return 0;
		} else if (arg1 || this.field5221 == 0) {
			int var3 = this.field5229.field5246[arg0.field5243];
			if (var3 == 0) {
				return arg0.field5243 == '\t' ? this.field5229.field5246[32] * 3 : this.field5229.field5246[32];
			} else {
				return var3;
			}
		} else {
			return this.field5229.field5246[42];
		}
	}

	@ObfuscatedName("rb.bq(III)Lvt;")
	public class558 method8649(int arg0, int arg1) {
		int var3 = Math.min(arg0, arg1);
		int var4 = Math.max(arg0, arg1);
		int var5 = this.field5230.size();
		if (var3 == 0 && var4 == var5) {
			return new class558(0, var5);
		}
		int var6 = this.method8650(var3, false);
		int var7 = this.method8651(var4, false);
		switch(this.field5231) {
			case 0:
				if (this.field5235 == 0) {
					return new class558(var6, var5);
				}
				int var9 = this.method8650(var3, true);
				return new class558(var9, var5);
			case 1:
				return new class558(0, var5);
			case 2:
				if (this.field5235 == 2) {
					return new class558(0, var7);
				}
				int var8 = this.method8651(var4, true);
				return new class558(0, var8);
			default:
				return new class558(0, var5);
		}
	}

	@ObfuscatedName("rb.bz(IZI)I")
	public int method8650(int arg0, boolean arg1) {
		if (arg0 < this.field5230.size()) {
			int var3 = ((class465) this.field5230.get(arg0)).field5245;
			for (int var4 = arg0; var4 > 0; var4--) {
				if (((class465) this.field5230.get(var4 - 1)).field5245 < var3) {
					if (!arg1) {
						return var4;
					}
					arg1 = false;
					var3 = ((class465) this.field5230.get(var4 - 1)).field5245;
				}
			}
		}
		return 0;
	}

	@ObfuscatedName("rb.bn(IZB)I")
	public int method8651(int arg0, boolean arg1) {
		if (arg0 < this.field5230.size()) {
			int var3 = ((class465) this.field5230.get(arg0)).field5245;
			for (int var4 = arg0; var4 < this.field5230.size() - 1; var4++) {
				if (((class465) this.field5230.get(var4 + 1)).field5245 > var3) {
					if (!arg1) {
						return var4;
					}
					arg1 = false;
					var3 = ((class465) this.field5230.get(var4 + 1)).field5245;
				}
			}
		}
		return this.field5230.size();
	}
}
