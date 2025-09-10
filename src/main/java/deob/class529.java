package deob;

@ObfuscatedName("uo")
public abstract class class529 implements class314 {

	@ObfuscatedName("uo.af")
	public class575 field5552;

	public class529(int arg0) {
	}

	@ObfuscatedName("uo.ac(Lwb;I)V")
	public void method9683(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			class525[] var3 = new class525[] { class525.field5543, class525.field5541, class525.field5544, class525.field5542 };
			class525 var4 = (class525) class432.method3817(var3, var2);
			if (var4 == null) {
				this.method9680(arg0, var2);
			} else {
				switch(var4.field5545) {
					case 1:
						arg0.method10502();
						break;
					case 2:
						int var5 = arg0.method10339();
						this.field5552 = class573.method9167(var5);
						if (this.field5552 != null) {
							break;
						}
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					case 3:
						class432.method3817(class396.method7523(), arg0.method10339());
						break;
					default:
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			}
		}
	}

	@ObfuscatedName("uo.ap(B)Z")
	public boolean method9693() {
		return this.field5552 != null;
	}

	@ObfuscatedName("uo.aq(I)Ljava/lang/Object;")
	public Object method9685() {
		if (class575.field5821 == this.field5552) {
			return 0;
		} else if (class575.field5817 == this.field5552) {
			return -1L;
		} else if (class575.field5825 == this.field5552) {
			return "";
		} else {
			return null;
		}
	}

	@ObfuscatedName("uo.af(Lwb;IB)V")
	public abstract void method9680(class591 arg0, int arg1);
}
