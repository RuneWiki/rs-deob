package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ts")
public class class513 extends class512 {

	@ObfuscatedName("ts.af")
	public Socket field5450;

	@ObfuscatedName("ts.aw")
	public class514 field5451;

	@ObfuscatedName("ts.at")
	public class515 field5449;

	public class513(Socket arg0, int arg1, int arg2) throws IOException {
		this.field5450 = arg0;
		this.field5450.setSoTimeout(30000);
		this.field5450.setTcpNoDelay(true);
		this.field5450.setReceiveBufferSize(65536);
		this.field5450.setSendBufferSize(65536);
		this.field5451 = new class514(this.field5450.getInputStream(), arg1);
		this.field5449 = new class515(this.field5450.getOutputStream(), arg2);
	}

	@ObfuscatedName("ts.af(II)Z")
	public boolean method9435(int arg0) throws IOException {
		return this.field5451.method9460(arg0);
	}

	@ObfuscatedName("ts.aw(I)I")
	public int method9418() throws IOException {
		return this.field5451.method9452();
	}

	@ObfuscatedName("ts.at(B)I")
	public int method9441() throws IOException {
		return this.field5451.method9454();
	}

	@ObfuscatedName("ts.ac([BIII)I")
	public int method9420(byte[] arg0, int arg1, int arg2) throws IOException {
		return this.field5451.method9471(arg0, arg1, arg2);
	}

	@ObfuscatedName("ts.ap([BIII)V")
	public void method9429(byte[] arg0, int arg1, int arg2) throws IOException {
		this.field5449.method9485(arg0, arg1, arg2);
	}

	@ObfuscatedName("ts.aq(I)V")
	public void method9422() {
		this.field5449.method9477();
		try {
			this.field5450.close();
		} catch (IOException var2) {
		}
		this.field5451.method9456();
	}

	public void finalize() {
		this.method9422();
	}
}
