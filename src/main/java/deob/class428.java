package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("qw")
public class class428 extends class427 {

    @ObfuscatedName("qw.at")
    public Socket field4627;

    @ObfuscatedName("qw.an")
    public class429 field4626;

    @ObfuscatedName("qw.av")
    public class430 field4625;

    public class428(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4627 = arg0;
        this.field4627.setSoTimeout(30000);
        this.field4627.setTcpNoDelay(true);
        this.field4627.setReceiveBufferSize(65536);
        this.field4627.setSendBufferSize(65536);
        this.field4626 = new class429(this.field4627.getInputStream(), arg1);
        this.field4625 = new class430(this.field4627.getOutputStream(), arg2);
    }

    @ObfuscatedName("qw.an(II)Z")
    public boolean method7274(int arg0) throws IOException {
        return this.field4626.method7281(arg0);
    }

    @ObfuscatedName("qw.av(B)I")
    public int method7259() throws IOException {
        return this.field4626.method7286();
    }

    @ObfuscatedName("qw.as(B)I")
    public int method7260() throws IOException {
        return this.field4626.method7283();
    }

    @ObfuscatedName("qw.ax([BIIB)I")
    public int method7261(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4626.method7284(arg0, arg1, arg2);
    }

    @ObfuscatedName("qw.ap([BIII)V")
    public void method7262(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4625.method7303(arg0, arg1, arg2);
    }

    @ObfuscatedName("qw.ab(S)V")
    public void method7263() {
        this.field4625.method7304();
        try {
            this.field4627.close();
        } catch (IOException var2) {
        }
        this.field4626.method7285();
    }

    public void finalize() {
        this.method7263();
    }
}
