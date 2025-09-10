package deob;

import java.lang.reflect.InvocationTargetException;

@ObfuscatedName("ul")
public abstract class class527 extends class315 implements class600 {

	public class527(class388 arg0, class433 arg1, int arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("ul.aw(I)I")
	public int method9666() {
		return this.field3516;
	}

	@ObfuscatedName("ul.at(IB)Ljava/lang/Object;")
	public Object method9675(int arg0) {
		class529 var2 = this.method9667(arg0);
		return var2 != null && var2.method9693() ? var2.method9685() : null;
	}

	@ObfuscatedName("ul.ac(Lwb;B)Lxv;")
	public class601 method9670(class591 arg0) {
		int var2 = arg0.method10341();
		class529 var3 = this.method9667(var2);
		class601 var4 = new class601(var2);
		Class var5 = var3.field5552.field5822;
		if (var5 == Integer.class) {
			var4.field5986 = arg0.method10345();
		} else if (var5 == Long.class) {
			var4.field5986 = arg0.method10346();
		} else if (var5 == String.class) {
			var4.field5986 = arg0.method10502();
		} else if (class595.class.isAssignableFrom(var5)) {
			try {
				class595 var6 = (class595) var5.getDeclaredConstructor().newInstance();
				var6.method10647(arg0, (byte) 0);
				var4.field5986 = var6;
			} catch (InstantiationException var9) {
			} catch (IllegalAccessException var10) {
			} catch (NoSuchMethodException var11) {
            } catch (InvocationTargetException var12) {
            }
		} else {
			throw new IllegalStateException();
		}
		return var4;
	}

	@ObfuscatedName("ul.af(II)Luo;")
	public abstract class529 method9667(int arg0);
}
