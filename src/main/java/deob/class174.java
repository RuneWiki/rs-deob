package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fx")
public final class class174 extends class170 implements Runnable {

    @ObfuscatedName("fx.d")
    public InputStream field2232;

    @ObfuscatedName("fx.z")
    public OutputStream field2236;

    @ObfuscatedName("fx.n")
    public Socket field2228;

    @ObfuscatedName("fx.r")
    public boolean field2231 = false;

    @ObfuscatedName("fx.e")
    public class167 field2230;

    @ObfuscatedName("fx.y")
    public class166 field2226;

    @ObfuscatedName("fx.k")
    public byte[] field2227;

    @ObfuscatedName("fx.s")
    public int field2233 = 0;

    @ObfuscatedName("fx.p")
    public int field2234 = 0;

    @ObfuscatedName("fx.x")
    public boolean field2235 = false;

    @ObfuscatedName("fx.m")
    public final int field2238;

    @ObfuscatedName("fx.h")
    public final int field2237;

    public class174(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2230 = arg1;
        this.field2228 = arg0;
        this.field2238 = arg2;
        this.field2237 = arg2 - 100;
        this.field2228.setSoTimeout(30000);
        this.field2228.setTcpNoDelay(true);
        this.field2228.setReceiveBufferSize(65536);
        this.field2228.setSendBufferSize(65536);
        this.field2232 = this.field2228.getInputStream();
        this.field2236 = this.field2228.getOutputStream();
    }

    @ObfuscatedName("fx.y(I)V")
    public void method3049() {
        if (this.field2231) {
            return;
        }
        synchronized (this) {
            this.field2231 = true;
            this.notifyAll();
        }
        if (this.field2226 != null) {
            while (this.field2226.field2179 == 0) {
                class204.method3573(1L);
            }
            if (this.field2226.field2179 == 1) {
                try {
                    ((Thread) this.field2226.field2176).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2226 = null;
    }

    public void finalize() {
        this.method3049();
    }

    @ObfuscatedName("fx.n(I)I")
    public int method3048() throws IOException {
        return this.field2231 ? 0 : this.field2232.read();
    }

    @ObfuscatedName("fx.z(I)I")
    public int method3054() throws IOException {
        return this.field2231 ? 0 : this.field2232.available();
    }

    @ObfuscatedName("fx.d(II)Z")
    public boolean method3061(int arg0) throws IOException {
        if (this.field2231) {
            return false;
        } else {
            return this.field2232.available() >= arg0;
        }
    }

    @ObfuscatedName("fx.r([BIII)I")
    public int method3057(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2231) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2232.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fx.a([BIII)V")
    public void method3080(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2231) {
            return;
        }
        if (this.field2235) {
            this.field2235 = false;
            throw new IOException();
        }
        if (this.field2227 == null) {
            this.field2227 = new byte[this.field2238];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2227[this.field2234] = arg0[arg1 + var5];
                this.field2234 = (this.field2234 + 1) % this.field2238;
                if ((this.field2237 + this.field2233) % this.field2238 == this.field2234) {
                    throw new IOException();
                }
            }
            if (this.field2226 == null) {
                this.field2226 = this.field2230.method3022(this, 3);
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
                        if (this.field2234 == this.field2233) {
                            if (this.field2231) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2233;
                        if (this.field2234 >= this.field2233) {
                            var4 = this.field2234 - this.field2233;
                        } else {
                            var4 = this.field2238 - this.field2233;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2236.write(this.field2227, var3, var4);
                    } catch (IOException var12) {
                        this.field2235 = true;
                    }
                    this.field2233 = (this.field2233 + var4) % this.field2238;
                    try {
                        if (this.field2234 == this.field2233) {
                            this.field2236.flush();
                        }
                    } catch (IOException var11) {
                        this.field2235 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2232 != null) {
                        this.field2232.close();
                    }
                    if (this.field2236 != null) {
                        this.field2236.close();
                    }
                    if (this.field2228 != null) {
                        this.field2228.close();
                    }
                } catch (IOException var10) {
                }
                this.field2227 = null;
                break;
            }
        } catch (Exception var15) {
            class165.method2426((String) null, var15);
        }
    }

    @ObfuscatedName("fx.e([BIII)V")
    public void method3050(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3080(arg0, arg1, arg2);
    }
}
