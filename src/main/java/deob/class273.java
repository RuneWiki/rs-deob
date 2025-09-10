package deob;

@ObfuscatedName("kj")
public class class273 implements class30 {

	@ObfuscatedName("kj.af")
	public class370 field3193 = null;

	@ObfuscatedName("kj.aw")
	public boolean field3195 = false;

	@ObfuscatedName("kj.at")
	public boolean field3194 = false;

	@ObfuscatedName("kj.an(I)Loi;")
	public class370 method5670() {
		return this.field3193;
	}

	@ObfuscatedName("kj.ar(Loi;B)V")
	public void method5678(class370 arg0) {
		if (arg0 == null) {
			this.method5671();
			return;
		}
		if (this.field3193 != arg0) {
			this.method5671();
			this.field3193 = arg0;
		}
		class365 var2 = arg0.method7361();
		if (var2 == null) {
			return;
		}
		if (!var2.field4067.method7226() && var2.field4069 != null) {
			class66 var3 = new class66();
			var3.method2103(arg0);
			var3.method2110(var2.field4069);
			client.method3688().method8033(var3);
		}
		var2.field4067.method6992(true);
	}

	@ObfuscatedName("kj.ae(I)V")
	public void method5671() {
		if (this.field3193 == null) {
			return;
		}
		class365 var1 = this.field3193.method7361();
		class370 var2 = this.field3193;
		this.field3193 = null;
		if (var1 == null) {
			return;
		}
		if (var1.field4067.method7226() && var1.field4069 != null) {
			class66 var3 = new class66();
			var3.method2103(var2);
			var3.method2110(var1.field4069);
			client.method3688().method8033(var3);
		}
		var1.field4067.method6992(false);
	}

	@ObfuscatedName("kj.af(IB)Z")
	public boolean method461(int arg0) {
		if (this.field3193 == null) {
			return false;
		}
		class29 var2 = this.field3193.method7360();
		if (var2 == null) {
			return false;
		}
		if (var2.method418(arg0)) {
			switch(arg0) {
				case 81:
					this.field3194 = true;
					break;
				case 82:
					this.field3195 = true;
					break;
				default:
					if (this.method5674(arg0)) {
						client.method2809(this.field3193);
					}
			}
		}
		return var2.method416(arg0);
	}

	@ObfuscatedName("kj.aw(II)Z")
	public boolean method450(int arg0) {
		switch(arg0) {
			case 81:
				this.field3194 = false;
				return false;
			case 82:
				this.field3195 = false;
				return false;
			default:
				return false;
		}
	}

	@ObfuscatedName("kj.at(CI)Z")
	public boolean method451(char arg0) {
		if (this.field3193 == null) {
			return false;
		} else if (class444.method6535(arg0)) {
			class367 var2 = this.field3193.method7358();
			if (var2 == null || !var2.method7045()) {
				return false;
			}
			class29 var3 = this.field3193.method7360();
			if (var3 == null) {
				return false;
			} else {
				if (var3.method419(arg0) && var2.method7006(arg0)) {
					client.method2809(this.field3193);
				}
				return var3.method417(arg0);
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("kj.ac(ZB)Z")
	public boolean method452(boolean arg0) {
		return false;
	}

	@ObfuscatedName("kj.ay(II)Z")
	public boolean method5674(int arg0) {
		if (this.field3193 == null) {
			return false;
		}
		class367 var2 = this.field3193.method7358();
		if (var2 == null || !var2.method7045()) {
			return false;
		}
		switch(arg0) {
			case 13:
				this.method5671();
				return true;
			case 48:
				if (this.field3195) {
					var2.method7012();
				}
				return true;
			case 65:
				if (this.field3195) {
					var2.method7031(client.method9336());
				}
				return true;
			case 66:
				if (this.field3195) {
					var2.method7055(client.method9336());
				}
				return true;
			case 67:
				if (this.field3195) {
					var2.method7032(client.method9336());
				}
				return true;
			case 84:
				if (var2.method7170() == 0) {
					var2.method7006(10);
				} else if (this.field3194 && var2.method7058()) {
					var2.method7006(10);
				} else {
					class365 var3 = this.field3193.method7361();
					class66 var4 = new class66();
					var4.method2103(this.field3193);
					var4.method2110(var3.field4071);
					client.method3688().method8033(var4);
					this.method5671();
				}
				return true;
			case 85:
				if (this.field3195) {
					var2.method7009();
				} else {
					var2.method7007();
				}
				return true;
			case 96:
				if (this.field3195) {
					var2.method7020(this.field3194);
				} else {
					var2.method7018(this.field3194);
				}
				return true;
			case 97:
				if (this.field3195) {
					var2.method7021(this.field3194);
				} else {
					var2.method7048(this.field3194);
				}
				return true;
			case 98:
				if (this.field3195) {
					var2.method7033();
				} else {
					var2.method7022(this.field3194);
				}
				return true;
			case 99:
				if (this.field3195) {
					var2.method7004();
				} else {
					var2.method7023(this.field3194);
				}
				return true;
			case 101:
				if (this.field3195) {
					var2.method7217();
				} else {
					var2.method7008();
				}
				return true;
			case 102:
				if (this.field3195) {
					var2.method7051(this.field3194);
				} else {
					var2.method7193(this.field3194);
				}
				return true;
			case 103:
				if (this.field3195) {
					var2.method7019(this.field3194);
				} else {
					var2.method7015(this.field3194);
				}
				return true;
			case 104:
				if (this.field3195) {
					var2.method7026(this.field3194);
				} else {
					var2.method7225(this.field3194);
				}
				return true;
			case 105:
				if (this.field3195) {
					var2.method7159(this.field3194);
				} else {
					var2.method7212(this.field3194);
				}
				return true;
			default:
				return false;
		}
	}
}
