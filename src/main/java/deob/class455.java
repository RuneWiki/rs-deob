package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("rc")
public class class455 extends class454 {

    @ObfuscatedName("rc.ac")
    public Socket field4725;

    @ObfuscatedName("rc.al")
    public class456 field4722;

    @ObfuscatedName("rc.ak")
    public class457 field4724;

    public class455(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4725 = arg0;
        this.field4725.setSoTimeout(30000);
        this.field4725.setTcpNoDelay(true);
        this.field4725.setReceiveBufferSize(65536);
        this.field4725.setSendBufferSize(65536);
        this.field4722 = new class456(this.field4725.getInputStream(), arg1);
        this.field4724 = new class457(this.field4725.getOutputStream(), arg2);
    }

    @ObfuscatedName("rc.al(II)Z")
    public boolean method7436(int arg0) throws IOException {
        return this.field4722.method7460(arg0);
    }

    @ObfuscatedName("rc.ak(I)I")
    public int method7448() throws IOException {
        return this.field4722.method7475();
    }

    @ObfuscatedName("rc.ax(B)I")
    public int method7438() throws IOException {
        return this.field4722.method7476();
    }

    @ObfuscatedName("rc.ao([BIII)I")
    public int method7447(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4722.method7469(arg0, arg1, arg2);
    }

    @ObfuscatedName("rc.ah([BIII)V")
    public void method7435(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4724.method7481(arg0, arg1, arg2);
    }

    @ObfuscatedName("rc.ar(S)V")
    public void method7441() {
        this.field4724.method7479();
        try {
            this.field4725.close();
        } catch (IOException var2) {
        }
        this.field4722.method7464();
    }

    public void finalize() {
        this.method7441();
    }
}
