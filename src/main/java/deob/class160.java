package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ft")
public class class160 extends class158 {

    @ObfuscatedName("ft.z")
    public Socket field1983;

    @ObfuscatedName("ft.w")
    public class152 field1981;

    @ObfuscatedName("ft.s")
    public class164 field1984;

    public class160(Socket arg0, int arg1, int arg2) throws IOException {
        this.field1983 = arg0;
        this.field1983.setSoTimeout(30000);
        this.field1983.setTcpNoDelay(true);
        this.field1983.setReceiveBufferSize(65536);
        this.field1983.setSendBufferSize(65536);
        this.field1981 = new class152(this.field1983.getInputStream(), arg1);
        this.field1984 = new class164(this.field1983.getOutputStream(), arg2);
    }

    @ObfuscatedName("ft.w(IB)Z")
    public boolean method3046(int arg0) throws IOException {
        return this.field1981.method2978(arg0);
    }

    @ObfuscatedName("ft.s(I)I")
    public int method3037() throws IOException {
        return this.field1981.method2976();
    }

    @ObfuscatedName("ft.l(I)I")
    public int method3042() throws IOException {
        return this.field1981.method2977();
    }

    @ObfuscatedName("ft.u([BIII)I")
    public int method3039(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field1981.method2983(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.q([BIIB)V")
    public void method3040(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field1984.method3089(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.i(I)V")
    public void method3041() {
        this.field1984.method3090();
        try {
            this.field1983.close();
        } catch (IOException var2) {
        }
        this.field1981.method2974();
    }

    public void finalize() {
        this.method3041();
    }
}
