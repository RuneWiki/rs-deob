package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("oq")
public class class367 {

	@ObfuscatedName("oq.ad")
	public class463 field4109 = new class463();

	@ObfuscatedName("oq.ag")
	public class463 field4099 = new class463();

	@ObfuscatedName("oq.av")
	public boolean field4100 = false;

	@ObfuscatedName("oq.ah")
	public boolean field4101 = true;

	@ObfuscatedName("oq.ab")
	public int field4102 = 0;

	@ObfuscatedName("oq.ax")
	public boolean field4103 = false;

	@ObfuscatedName("oq.ak")
	public int field4104 = 0;

	@ObfuscatedName("oq.aj")
	public int field4095 = 0;

	@ObfuscatedName("oq.az")
	public int field4106 = 0;

	@ObfuscatedName("oq.bt")
	public int field4107 = 0;

	@ObfuscatedName("oq.bs")
	public int field4097 = 0;

	@ObfuscatedName("oq.bu")
	public int field4118 = 0;

	@ObfuscatedName("oq.bi")
	public int field4110 = 0;

	@ObfuscatedName("oq.bd")
	public int field4098 = Integer.MAX_VALUE;

	@ObfuscatedName("oq.ba")
	public int field4112 = Integer.MAX_VALUE;

	@ObfuscatedName("oq.bb")
	public int field4113 = 0;

	@ObfuscatedName("oq.bo")
	public int field4114 = 0;

	@ObfuscatedName("oq.bl")
	public int field4108 = 0;

	@ObfuscatedName("oq.by")
	public int field4116 = 0;

	@ObfuscatedName("oq.bg")
	public class358 field4117;

	@ObfuscatedName("oq.bx")
	public class358 field4093;

	public class367() {
		this.field4109.method8701(1);
		this.field4099.method8701(1);
	}

	@ObfuscatedName("oq.af(B)V")
	public void method6998() {
		this.field4102 = (this.field4102 + 1) % 60;
		if (this.field4110 > 0) {
			this.field4110--;
		}
	}

	@ObfuscatedName("oq.aw(ZI)Z")
	public boolean method6992(boolean arg0) {
		boolean var2 = arg0 && this.field4101;
		boolean var3 = this.field4100 != var2;
		this.field4100 = var2;
		if (!this.field4100) {
			this.method6991(this.field4107, this.field4107);
		}
		return var3;
	}

	@ObfuscatedName("oq.at(ZI)V")
	public void method6993(boolean arg0) {
		this.field4101 = arg0;
		this.field4100 = arg0 && this.field4100;
	}

	@ObfuscatedName("oq.ac(Ljava/lang/String;B)Z")
	public boolean method6994(String arg0) {
		String var2 = this.field4109.method8673();
		if (var2.equals(arg0)) {
			return false;
		}
		String var3 = this.method7060(arg0);
		this.field4109.method8724(var3);
		this.method6991(this.field4097, this.field4107);
		this.method7246(this.field4108, this.field4116);
		this.method7083();
		this.method7069();
		return true;
	}

	@ObfuscatedName("oq.ap(Ljava/lang/String;B)Z")
	public boolean method7204(String arg0) {
		this.field4099.method8724(arg0);
		return true;
	}

	@ObfuscatedName("oq.aq(Lri;I)Z")
	public boolean method7133(class466 arg0) {
		boolean var2 = !this.field4103;
		this.field4109.method8697(arg0);
		this.field4099.method8697(arg0);
		this.field4103 = true;
		boolean var3 = var2 | this.method7246(this.field4108, this.field4116);
		boolean var4 = var3 | this.method6991(this.field4097, this.field4107);
		if (this.method7083()) {
			this.method7069();
			var4 = true;
		}
		return var4;
	}

	@ObfuscatedName("oq.ao(III)Z")
	public boolean method7267(int arg0, int arg1) {
		boolean var3 = this.field4113 != arg0 || this.field4114 != arg1;
		this.field4113 = arg0;
		this.field4114 = arg1;
		return var3 | this.method7246(this.field4108, this.field4116);
	}

	@ObfuscatedName("oq.as(II)Z")
	public boolean method7219(int arg0) {
		if (arg0 < 0) {
			arg0 = Integer.MAX_VALUE;
		}
		boolean var2 = arg0 == this.field4109.method8636();
		this.field4109.method8637(arg0);
		this.field4099.method8637(arg0);
		if (this.method7083()) {
			this.method7069();
			var2 = true;
		}
		return var2;
	}

	@ObfuscatedName("oq.al(IB)Z")
	public boolean method6999(int arg0) {
		this.field4109.method8644(arg0);
		if (this.method7083()) {
			this.method7069();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("oq.au(II)Z")
	public boolean method7000(int arg0) {
		this.field4112 = arg0;
		if (this.method7083()) {
			this.method7069();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("oq.ai(IIB)Z")
	public boolean method7246(int arg0, int arg1) {
		if (!this.method7045()) {
			this.field4108 = arg0;
			this.field4116 = arg1;
			return false;
		}
		int var3 = this.field4108;
		int var4 = this.field4116;
		int var5 = Math.max(0, this.field4109.method8652() - this.field4113 + 2);
		int var6 = Math.max(0, this.field4109.method8632() - this.field4114 + 1);
		this.field4108 = Math.max(0, Math.min(var5, arg0));
		this.field4116 = Math.max(0, Math.min(var6, arg1));
		return this.field4108 != var3 || this.field4116 != var4;
	}

	@ObfuscatedName("oq.aa(III)Z")
	public boolean method7252(int arg0, int arg1) {
		boolean var3 = true;
		if (arg0 < 0 || arg0 > 2) {
			var3 = false;
		}
		if (arg1 < 0 || arg1 > 2) {
			var3 = false;
		}
		return var3 ? this.field4109.method8619(arg0, arg1) : false;
	}

	@ObfuscatedName("oq.am(IB)V")
	public void method7003(int arg0) {
		this.field4109.method8620(arg0);
	}

	@ObfuscatedName("oq.an(II)Z")
	public boolean method7103(int arg0) {
		this.field4106 = arg0;
		String var2 = this.field4109.method8673();
		int var3 = var2.length();
		String var4 = this.method7060(var2);
		if (var4.length() == var3) {
			return false;
		}
		this.field4109.method8724(var4);
		this.method7246(this.field4108, this.field4116);
		this.method7083();
		this.method7069();
		return true;
	}

	@ObfuscatedName("oq.ar(I)V")
	public void method7005() {
		this.field4103 = false;
	}

	@ObfuscatedName("oq.ae(II)Z")
	public boolean method7006(int arg0) {
		if (this.method7070(arg0)) {
			this.method7011();
			class464 var2 = this.field4109.method8611((char) arg0, this.field4107, this.field4098);
			this.method6991(var2.method8742(), var2.method8742());
			this.method7083();
			this.method7069();
		}
		return true;
	}

	@ObfuscatedName("oq.ay(I)V")
	public void method7007() {
		if (!this.method7011() && this.field4107 > 0) {
			int var1 = this.field4109.method8610(this.field4107 - 1);
			this.method7069();
			this.method6991(var1, var1);
		}
	}

	@ObfuscatedName("oq.ad(B)V")
	public void method7008() {
		if (!this.method7011() && this.field4107 < this.field4109.method8719()) {
			int var1 = this.field4109.method8610(this.field4107);
			this.method7069();
			this.method6991(var1, var1);
		}
	}

	@ObfuscatedName("oq.ag(I)V")
	public void method7009() {
		if (!this.method7011() && this.field4107 > 0) {
			class558 var1 = this.method7040(this.field4107 - 1);
			int var2 = this.field4109.method8628((Integer) var1.field5758, this.field4107);
			this.method7069();
			this.method6991(var2, var2);
		}
	}

	@ObfuscatedName("oq.av(I)V")
	public void method7217() {
		if (!this.method7011() && this.field4107 < this.field4109.method8719()) {
			class558 var1 = this.method7040(this.field4107);
			int var2 = this.field4109.method8628(this.field4107, (Integer) var1.field5757);
			this.method7069();
			this.method6991(var2, var2);
		}
	}

	@ObfuscatedName("oq.ah(I)Z")
	public boolean method7011() {
		if (this.method7116()) {
			int var1 = this.field4109.method8628(this.field4097, this.field4107);
			this.method7069();
			this.method6991(var1, var1);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("oq.ab(B)V")
	public void method7012() {
		this.method6991(0, this.field4109.method8719());
	}

	@ObfuscatedName("oq.ax(III)Z")
	public boolean method6991(int arg0, int arg1) {
		if (!this.method7045()) {
			this.field4097 = arg0;
			this.field4107 = arg1;
			return false;
		}
		if (arg0 > this.field4109.method8719()) {
			arg0 = this.field4109.method8719();
		}
		if (arg1 > this.field4109.method8719()) {
			arg1 = this.field4109.method8719();
		}
		boolean var3 = this.field4097 != arg0 || this.field4107 != arg1;
		this.field4097 = arg0;
		if (this.field4107 != arg1) {
			this.field4107 = arg1;
			this.field4102 = 0;
			this.method7067();
		}
		if (var3 && this.field4093 != null) {
			this.field4093.method2762();
		}
		return var3;
	}

	@ObfuscatedName("oq.ak(ZI)V")
	public void method7193(boolean arg0) {
		class558 var2 = this.method7063(this.field4107);
		this.method7065((Integer) var2.field5758, arg0);
	}

	@ObfuscatedName("oq.aj(ZI)V")
	public void method7015(boolean arg0) {
		class558 var2 = this.method7063(this.field4107);
		this.method7065((Integer) var2.field5757, arg0);
	}

	@ObfuscatedName("oq.az(ZI)V")
	public void method7051(boolean arg0) {
		this.method7065(0, arg0);
	}

	@ObfuscatedName("oq.bt(ZS)V")
	public void method7019(boolean arg0) {
		this.method7065(this.field4109.method8719(), arg0);
	}

	@ObfuscatedName("oq.bs(ZB)V")
	public void method7018(boolean arg0) {
		if (this.method7116() && !arg0) {
			this.method7065(Math.min(this.field4097, this.field4107), arg0);
		} else if (this.field4107 > 0) {
			this.method7065(this.field4107 - 1, arg0);
		}
	}

	@ObfuscatedName("oq.bu(ZB)V")
	public void method7048(boolean arg0) {
		if (this.method7116() && !arg0) {
			this.method7065(Math.max(this.field4097, this.field4107), arg0);
		} else if (this.field4107 < this.field4109.method8719()) {
			this.method7065(this.field4107 + 1, arg0);
		}
	}

	@ObfuscatedName("oq.bi(ZI)V")
	public void method7020(boolean arg0) {
		if (this.field4107 > 0) {
			class558 var2 = this.method7040(this.field4107 - 1);
			this.method7065((Integer) var2.field5758, arg0);
		}
	}

	@ObfuscatedName("oq.bd(ZI)V")
	public void method7021(boolean arg0) {
		if (this.field4107 < this.field4109.method8719()) {
			class558 var2 = this.method7040(this.field4107 + 1);
			this.method7065((Integer) var2.field5757, arg0);
		}
	}

	@ObfuscatedName("oq.ba(ZB)V")
	public void method7022(boolean arg0) {
		if (this.field4107 > 0) {
			this.method7065(this.field4109.method8695(this.field4107, -1), arg0);
		}
	}

	@ObfuscatedName("oq.bb(ZI)V")
	public void method7023(boolean arg0) {
		if (this.field4107 < this.field4109.method8719()) {
			this.method7065(this.field4109.method8695(this.field4107, 1), arg0);
		}
	}

	@ObfuscatedName("oq.bo(ZI)V")
	public void method7225(boolean arg0) {
		if (this.field4107 > 0) {
			int var2 = this.method7066();
			this.method7065(this.field4109.method8695(this.field4107, -var2), arg0);
		}
	}

	@ObfuscatedName("oq.bl(ZI)V")
	public void method7212(boolean arg0) {
		if (this.field4107 < this.field4109.method8719()) {
			int var2 = this.method7066();
			this.method7065(this.field4109.method8695(this.field4107, var2), arg0);
		}
	}

	@ObfuscatedName("oq.by(ZI)V")
	public void method7026(boolean arg0) {
		class467 var2 = this.field4109.method8621(0, this.field4107);
		class558 var3 = var2.method8859();
		this.method7065(this.field4109.method8629((Integer) var3.field5758, this.field4116), arg0);
	}

	@ObfuscatedName("oq.bg(ZI)V")
	public void method7159(boolean arg0) {
		class467 var2 = this.field4109.method8621(0, this.field4107);
		class558 var3 = var2.method8859();
		this.method7065(this.field4109.method8629((Integer) var3.field5758, this.field4116 + this.field4114), arg0);
	}

	@ObfuscatedName("oq.bx(IIZZB)V")
	public void method7028(int arg0, int arg1, boolean arg2, boolean arg3) {
		boolean var5 = false;
		int var6;
		if (this.field4103) {
			int var7 = this.field4108 + arg0;
			int var8 = this.field4116 + arg1;
			class558 var9 = this.method7071();
			var6 = this.field4109.method8629(var7 - (Integer) var9.field5758, var8 - (Integer) var9.field5757);
		} else {
			var6 = 0;
		}
		if (arg2 && arg3) {
			this.field4095 = 1;
			class558 var10 = this.method7040(var6);
			class558 var11 = this.method7040(this.field4118);
			this.method7241(var11, var10);
		} else if (arg2) {
			this.field4095 = 1;
			class558 var12 = this.method7040(var6);
			this.method6991((Integer) var12.field5758, (Integer) var12.field5757);
			this.field4118 = (Integer) var12.field5758;
		} else if (arg3) {
			this.method6991(this.field4118, var6);
		} else {
			if (this.field4110 <= 0 || this.field4118 != var6) {
				this.field4095 = 0;
				this.method6991(var6, var6);
				this.field4118 = var6;
			} else if (this.field4107 == this.field4097) {
				this.field4095 = 1;
				class558 var13 = this.method7040(var6);
				this.method6991((Integer) var13.field5758, (Integer) var13.field5757);
			} else {
				this.field4095 = 2;
				class558 var14 = this.method7063(var6);
				this.method6991((Integer) var14.field5758, (Integer) var14.field5757);
			}
			this.field4110 = 25;
		}
	}

	@ObfuscatedName("oq.bq(IIB)V")
	public void method7029(int arg0, int arg1) {
		if (!this.field4103 || !this.method7226()) {
			return;
		}
		int var3 = this.field4108 + arg0;
		int var4 = this.field4116 + arg1;
		class558 var5 = this.method7071();
		int var6 = this.field4109.method8629(var3 - (Integer) var5.field5758, var4 - (Integer) var5.field5757);
		switch(this.field4095) {
			case 0:
				this.method6991(this.field4097, var6);
				break;
			case 1:
				class558 var9 = this.method7040(this.field4118);
				class558 var10 = this.method7040(var6);
				this.method7241(var9, var10);
				break;
			case 2:
				class558 var7 = this.method7063(this.field4118);
				class558 var8 = this.method7063(var6);
				this.method7241(var7, var8);
		}
	}

	@ObfuscatedName("oq.bz(Ljava/awt/datatransfer/Clipboard;I)V")
	public void method7055(Clipboard arg0) {
		class467 var2 = this.field4109.method8621(this.field4097, this.field4107);
		if (!var2.method8868()) {
			String var3 = var2.method8853();
			if (!var3.isEmpty()) {
				arg0.setContents(new StringSelection(var3), null);
			}
		}
	}

	@ObfuscatedName("oq.bn(Ljava/awt/datatransfer/Clipboard;B)V")
	public void method7031(Clipboard arg0) {
		if (this.method7116()) {
			this.method7055(arg0);
			this.method7011();
		}
	}

	@ObfuscatedName("oq.be(Ljava/awt/datatransfer/Clipboard;I)V")
	public void method7032(Clipboard arg0) {
		Transferable var2 = arg0.getContents(null);
		if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			return;
		}
		try {
			String var3 = this.method7060((String) var2.getTransferData(DataFlavor.stringFlavor));
			this.method7011();
			class464 var4 = this.field4109.method8623(var3, this.field4107, this.field4098);
			this.method6991(var4.method8742(), var4.method8742());
			this.method7083();
			this.method7069();
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("oq.bh(I)V")
	public void method7033() {
		this.field4116 = Math.max(0, this.field4116 - this.field4109.method8633());
	}

	@ObfuscatedName("oq.bk(B)V")
	public void method7004() {
		int var1 = Math.max(0, this.field4109.method8632() - this.field4114);
		this.field4116 = Math.min(var1, this.field4116 + this.field4109.method8633());
	}

	@ObfuscatedName("oq.bp(Lnc;I)V")
	public void method7035(class358 arg0) {
		this.field4117 = arg0;
	}

	@ObfuscatedName("oq.br(Lnc;I)V")
	public void method7064(class358 arg0) {
		this.field4093 = arg0;
	}

	@ObfuscatedName("oq.bv(I)Lrb;")
	public class463 method7037() {
		return this.field4109;
	}

	@ObfuscatedName("oq.bj(I)Lrb;")
	public class463 method7038() {
		return this.field4099;
	}

	@ObfuscatedName("oq.bm(I)Lrh;")
	public class467 method7183() {
		return this.field4109.method8621(this.field4097, this.field4107);
	}

	@ObfuscatedName("oq.bf(I)Z")
	public boolean method7226() {
		return this.field4100;
	}

	@ObfuscatedName("oq.bw(I)Z")
	public boolean method7041() {
		return this.field4101;
	}

	@ObfuscatedName("oq.bc(I)Z")
	public boolean method7042() {
		return this.method7226() && this.field4102 % 60 < 30;
	}

	@ObfuscatedName("oq.cw(B)I")
	public int method7043() {
		return this.field4107;
	}

	@ObfuscatedName("oq.cz(B)I")
	public int method7244() {
		return this.field4097;
	}

	@ObfuscatedName("oq.cf(B)Z")
	public boolean method7045() {
		return this.field4103;
	}

	@ObfuscatedName("oq.cg(B)I")
	public int method7179() {
		return this.field4108;
	}

	@ObfuscatedName("oq.ci(B)I")
	public int method7047() {
		return this.field4116;
	}

	@ObfuscatedName("oq.cp(I)I")
	public int method7164() {
		return this.field4109.method8636();
	}

	@ObfuscatedName("oq.cm(B)I")
	public int method7049() {
		return this.field4109.method8670();
	}

	@ObfuscatedName("oq.cc(B)I")
	public int method7050() {
		return this.field4112;
	}

	@ObfuscatedName("oq.cj(I)I")
	public int method7170() {
		return this.field4104;
	}

	@ObfuscatedName("oq.ce(II)V")
	public void method7052(int arg0) {
		this.field4104 = arg0;
	}

	@ObfuscatedName("oq.cr(I)I")
	public int method7053() {
		return this.field4109.method8640();
	}

	@ObfuscatedName("oq.cb(II)V")
	public void method7054(int arg0) {
		this.field4109.method8701(arg0);
	}

	@ObfuscatedName("oq.cu(I)I")
	public int method7160() {
		return this.field4106;
	}

	@ObfuscatedName("oq.cq(I)I")
	public int method7076() {
		return this.field4109.method8631();
	}

	@ObfuscatedName("oq.cn(II)V")
	public void method7057(int arg0) {
		this.field4109.method8617(arg0);
	}

	@ObfuscatedName("oq.cl(I)Z")
	public boolean method7058() {
		return this.method7049() > 1;
	}

	@ObfuscatedName("oq.cx(I)Z")
	public boolean method7116() {
		return this.field4107 != this.field4097;
	}

	@ObfuscatedName("oq.cv(Ljava/lang/String;I)Ljava/lang/String;")
	public String method7060(String arg0) {
		StringBuilder var2 = new StringBuilder(arg0.length());
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			char var4 = arg0.charAt(var3);
			if (this.method7070(var4)) {
				var2.append(var4);
			}
		}
		return var2.toString();
	}

	@ObfuscatedName("oq.ca(Lvt;Lvt;I)V")
	public void method7241(class558 arg0, class558 arg1) {
		if ((Integer) arg1.field5758 < (Integer) arg0.field5758) {
			this.method6991((Integer) arg0.field5757, (Integer) arg1.field5758);
		} else {
			this.method6991((Integer) arg0.field5758, (Integer) arg1.field5757);
		}
	}

	@ObfuscatedName("oq.cy(IB)Lvt;")
	public class558 method7040(int arg0) {
		int var2 = this.field4109.method8719();
		int var3 = 0;
		int var4 = var2;
		for (int var5 = arg0; var5 > 0; var5--) {
			if (this.method7068(this.field4109.method8726(var5 - 1).field5243)) {
				var3 = var5;
				break;
			}
		}
		for (int var6 = arg0; var6 < var2; var6++) {
			if (this.method7068(this.field4109.method8726(var6).field5243)) {
				var4 = var6;
				break;
			}
		}
		return new class558(var3, var4);
	}

	@ObfuscatedName("oq.cd(II)Lvt;")
	public class558 method7063(int arg0) {
		int var2 = this.field4109.method8719();
		int var3 = 0;
		int var4 = var2;
		for (int var5 = arg0; var5 > 0; var5--) {
			if (this.field4109.method8726(var5 - 1).field5243 == '\n') {
				var3 = var5;
				break;
			}
		}
		for (int var6 = arg0; var6 < var2; var6++) {
			if (this.field4109.method8726(var6).field5243 == '\n') {
				var4 = var6;
				break;
			}
		}
		return new class558(var3, var4);
	}

	@ObfuscatedName("oq.co(I)Z")
	public boolean method7083() {
		if (!this.method7045()) {
			return false;
		}
		boolean var1 = false;
		if (this.field4109.method8719() > this.field4112) {
			this.field4109.method8628(this.field4112, this.field4109.method8719());
			var1 = true;
		}
		int var2 = this.method7049();
		if (this.field4109.method8709() > var2) {
			int var3 = this.field4109.method8695(0, var2) - 1;
			this.field4109.method8628(var3, this.field4109.method8719());
			var1 = true;
		}
		if (var1) {
			int var4 = this.field4107;
			int var5 = this.field4097;
			int var6 = this.field4109.method8719();
			if (this.field4107 > var6) {
				var4 = var6;
			}
			if (this.field4097 > var6) {
				var5 = var6;
			}
			this.method6991(var5, var4);
		}
		return var1;
	}

	@ObfuscatedName("oq.ck(IZI)V")
	public void method7065(int arg0, boolean arg1) {
		if (arg1) {
			this.method6991(this.field4097, arg0);
		} else {
			this.method6991(arg0, arg0);
		}
	}

	@ObfuscatedName("oq.ct(B)I")
	public int method7066() {
		return this.field4114 / this.field4109.method8633();
	}

	@ObfuscatedName("oq.ch(I)V")
	public void method7067() {
		class467 var1 = this.field4109.method8621(0, this.field4107);
		class558 var2 = var1.method8859();
		int var3 = this.field4109.method8633();
		int var4 = (Integer) var2.field5758 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer) var2.field5757 - 3;
		int var7 = var6 + 6 + var3;
		int var8 = this.field4108;
		int var9 = this.field4113 + var8;
		int var10 = this.field4116;
		int var11 = this.field4114 + var10;
		int var12 = this.field4108;
		int var13 = this.field4116;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field4113;
		}
		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field4114;
		}
		this.method7246(var12, var13);
	}

	@ObfuscatedName("oq.cs(II)Z")
	public boolean method7068(int arg0) {
		return arg0 == 32 || arg0 == 10 || arg0 == 9;
	}

	@ObfuscatedName("oq.dd(I)V")
	public void method7069() {
		if (this.field4117 != null) {
			this.field4117.method2762();
		}
	}

	@ObfuscatedName("oq.dr(IS)Z")
	public boolean method7070(int arg0) {
		switch(this.field4106) {
			case 1:
				return class446.method5403((char) arg0);
			case 2:
				return class446.method5658((char) arg0);
			case 3:
				return class446.method7633((char) arg0);
			case 4:
				char var2 = (char) arg0;
				if (class446.method7633(var2)) {
					return true;
				} else if (var2 == 'k' || var2 == 'K' || var2 == 'm' || var2 == 'M' || var2 == 'b' || var2 == 'B') {
					return true;
				} else {
					return false;
				}
			default:
				return true;
		}
	}

	@ObfuscatedName("oq.ds(B)Lvt;")
	public class558 method7071() {
		int var1 = this.field4109.method8643(this.field4113);
		int var2 = this.field4109.method8642(this.field4114);
		return new class558(var1, var2);
	}
}
