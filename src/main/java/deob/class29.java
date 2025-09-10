package deob;

import java.util.Arrays;

@ObfuscatedName("bu")
public class class29 {

	@ObfuscatedName("bu.ao")
	public int[] field143 = new int[112];

	@ObfuscatedName("bu.as")
	public int[] field144 = new int[192];

	public class29() {
		Arrays.fill(this.field143, 3);
		Arrays.fill(this.field144, 3);
	}

	@ObfuscatedName("bu.af(IIS)V")
	public void method412(int arg0, int arg1) {
		if (this.method420(arg0) && this.method444(arg1)) {
			this.field143[arg0] = arg1;
		}
	}

	@ObfuscatedName("bu.aw(CII)V")
	public void method413(char arg0, int arg1) {
		if (this.method421(arg0) && this.method444(arg1)) {
			this.field144[arg0] = arg1;
		}
	}

	@ObfuscatedName("bu.at(II)I")
	public int method414(int arg0) {
		return this.method420(arg0) ? this.field143[arg0] : 0;
	}

	@ObfuscatedName("bu.ac(CI)I")
	public int method415(char arg0) {
		return this.method421(arg0) ? this.field144[arg0] : 0;
	}

	@ObfuscatedName("bu.ap(II)Z")
	public boolean method416(int arg0) {
		return this.method420(arg0) && (this.field143[arg0] == 1 || this.field143[arg0] == 3);
	}

	@ObfuscatedName("bu.aq(CB)Z")
	public boolean method417(char arg0) {
		return this.method421(arg0) && (this.field144[arg0] == 1 || this.field144[arg0] == 3);
	}

	@ObfuscatedName("bu.ao(II)Z")
	public boolean method418(int arg0) {
		return this.method420(arg0) && (this.field143[arg0] == 2 || this.field143[arg0] == 3);
	}

	@ObfuscatedName("bu.as(CI)Z")
	public boolean method419(char arg0) {
		return this.method421(arg0) && (this.field144[arg0] == 2 || this.field144[arg0] == 3);
	}

	@ObfuscatedName("bu.al(II)Z")
	public boolean method420(int arg0) {
		if (arg0 >= 0 && arg0 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + arg0);
			return false;
		}
	}

	@ObfuscatedName("bu.au(CI)Z")
	public boolean method421(char arg0) {
		if (arg0 >= 0 && arg0 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + arg0);
			return false;
		}
	}

	@ObfuscatedName("bu.ai(II)Z")
	public boolean method444(int arg0) {
		if (arg0 >= 0 && arg0 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + arg0);
			return false;
		}
	}
}
