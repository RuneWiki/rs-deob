package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fx")
public final class class174 extends class170 implements Runnable {

    @ObfuscatedName("fx.o")
    public Socket field2243;

    @ObfuscatedName("fx.k")
    public InputStream field2248;

    @ObfuscatedName("fx.t")
    public OutputStream field2244;

    @ObfuscatedName("fx.d")
    public boolean field2246 = false;

    @ObfuscatedName("fx.h")
    public class167 field2245;

    @ObfuscatedName("fx.m")
    public class166 field2249;

    @ObfuscatedName("fx.z")
    public byte[] field2247;

    @ObfuscatedName("fx.i")
    public int field2252 = 0;

    @ObfuscatedName("fx.u")
    public int field2241 = 0;

    @ObfuscatedName("fx.x")
    public boolean field2250 = false;

    @ObfuscatedName("fx.y")
    public final int field2251;

    @ObfuscatedName("fx.a")
    public final int field2253;

    public class174(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2245 = arg1;
        this.field2243 = arg0;
        this.field2251 = arg2;
        this.field2253 = arg2 - 100;
        this.field2243.setSoTimeout(30000);
        this.field2243.setTcpNoDelay(true);
        this.field2243.setReceiveBufferSize(65536);
        this.field2243.setSendBufferSize(65536);
        this.field2248 = this.field2243.getInputStream();
        this.field2244 = this.field2243.getOutputStream();
    }

    @ObfuscatedName("fx.z(I)V")
    public void method3014() {
        if (this.field2246) {
            return;
        }
        synchronized (this) {
            this.field2246 = true;
            this.notifyAll();
        }
        if (this.field2249 != null) {
            while (this.field2249.field2204 == 0) {
                class204.method12(1L);
            }
            if (this.field2249.field2204 == 1) {
                try {
                    ((Thread) this.field2249.field2206).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2249 = null;
    }

    public void finalize() {
        this.method3014();
    }

    @ObfuscatedName("fx.d(I)I")
    public int method3011() throws IOException {
        return this.field2246 ? 0 : this.field2248.read();
    }

    @ObfuscatedName("fx.t(B)I")
    public int method3028() throws IOException {
        return this.field2246 ? 0 : this.field2248.available();
    }

    @ObfuscatedName("fx.k(II)Z")
    public boolean method3010(int arg0) throws IOException {
        if (this.field2246) {
            return false;
        } else {
            return this.field2248.available() >= arg0;
        }
    }

    @ObfuscatedName("fx.h([BIII)I")
    public int method3024(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2246) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2248.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fx.ac([BIII)V")
    public void method3044(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2246) {
            return;
        }
        if (this.field2250) {
            this.field2250 = false;
            throw new IOException();
        }
        if (this.field2247 == null) {
            this.field2247 = new byte[this.field2251];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2247[this.field2241] = arg0[arg1 + var5];
                this.field2241 = (this.field2241 + 1) % this.field2251;
                if ((this.field2253 + this.field2252) % this.field2251 == this.field2241) {
                    throw new IOException();
                }
            }
            if (this.field2249 == null) {
                this.field2249 = this.field2245.method2972(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2252 == this.field2241) {
                            if (this.field2246) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2252;
                        if (this.field2241 >= this.field2252) {
                            var4 = this.field2241 - this.field2252;
                        } else {
                            var4 = this.field2251 - this.field2252;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2244.write(this.field2247, var3, var4);
                    } catch (IOException var12) {
                        this.field2250 = true;
                    }
                    this.field2252 = (this.field2252 + var4) % this.field2251;
                    try {
                        if (this.field2252 == this.field2241) {
                            this.field2244.flush();
                        }
                    } catch (IOException var11) {
                        this.field2250 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2248 != null) {
                        this.field2248.close();
                    }
                    if (this.field2244 != null) {
                        this.field2244.close();
                    }
                    if (this.field2243 != null) {
                        this.field2243.close();
                    }
                } catch (IOException var10) {
                }
                this.field2247 = null;
                break;
            }
        } catch (Exception var15) {
            class165.method1744((String) null, var15);
        }
    }

    @ObfuscatedName("fx.m([BIII)V")
    public void method3020(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3044(arg0, arg1, arg2);
    }
}
