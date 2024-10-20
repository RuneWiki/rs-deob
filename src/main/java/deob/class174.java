package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fu")
public final class class174 extends class170 implements Runnable {

    @ObfuscatedName("fu.c")
    public InputStream field2232;

    @ObfuscatedName("fu.i")
    public OutputStream field2235;

    @ObfuscatedName("fu.o")
    public Socket field2236;

    @ObfuscatedName("fu.j")
    public boolean field2230 = false;

    @ObfuscatedName("fu.k")
    public class167 field2234;

    @ObfuscatedName("fu.x")
    public class166 field2233;

    @ObfuscatedName("fu.z")
    public byte[] field2231;

    @ObfuscatedName("fu.p")
    public int field2237 = 0;

    @ObfuscatedName("fu.w")
    public int field2244 = 0;

    @ObfuscatedName("fu.r")
    public boolean field2239 = false;

    @ObfuscatedName("fu.d")
    public final int field2240;

    @ObfuscatedName("fu.a")
    public final int field2241;

    public class174(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2234 = arg1;
        this.field2236 = arg0;
        this.field2240 = arg2;
        this.field2241 = arg2 - 100;
        this.field2236.setSoTimeout(30000);
        this.field2236.setTcpNoDelay(true);
        this.field2236.setReceiveBufferSize(65536);
        this.field2236.setSendBufferSize(65536);
        this.field2232 = this.field2236.getInputStream();
        this.field2235 = this.field2236.getOutputStream();
    }

    @ObfuscatedName("fu.z(I)V")
    public void method3022() {
        if (this.field2230) {
            return;
        }
        synchronized (this) {
            this.field2230 = true;
            this.notifyAll();
        }
        if (this.field2233 != null) {
            while (this.field2233.field2190 == 0) {
                class204.method2982(1L);
            }
            if (this.field2233.field2190 == 1) {
                try {
                    ((Thread) this.field2233.field2194).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2233 = null;
    }

    public void finalize() {
        this.method3022();
    }

    @ObfuscatedName("fu.j(I)I")
    public int method3019() throws IOException {
        return this.field2230 ? 0 : this.field2232.read();
    }

    @ObfuscatedName("fu.o(I)I")
    public int method3018() throws IOException {
        return this.field2230 ? 0 : this.field2232.available();
    }

    @ObfuscatedName("fu.i(IB)Z")
    public boolean method3029(int arg0) throws IOException {
        if (this.field2230) {
            return false;
        } else {
            return this.field2232.available() >= arg0;
        }
    }

    @ObfuscatedName("fu.k([BIII)I")
    public int method3026(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2230) {
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

    @ObfuscatedName("fu.s([BIIB)V")
    public void method3043(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2230) {
            return;
        }
        if (this.field2239) {
            this.field2239 = false;
            throw new IOException();
        }
        if (this.field2231 == null) {
            this.field2231 = new byte[this.field2240];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2231[this.field2244] = arg0[arg1 + var5];
                this.field2244 = (this.field2244 + 1) % this.field2240;
                if ((this.field2241 + this.field2237) % this.field2240 == this.field2244) {
                    throw new IOException();
                }
            }
            if (this.field2233 == null) {
                this.field2233 = this.field2234.method2989(this, 3);
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
                        if (this.field2244 == this.field2237) {
                            if (this.field2230) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2237;
                        if (this.field2244 >= this.field2237) {
                            var4 = this.field2244 - this.field2237;
                        } else {
                            var4 = this.field2240 - this.field2237;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2235.write(this.field2231, var3, var4);
                    } catch (IOException var12) {
                        this.field2239 = true;
                    }
                    this.field2237 = (this.field2237 + var4) % this.field2240;
                    try {
                        if (this.field2244 == this.field2237) {
                            this.field2235.flush();
                        }
                    } catch (IOException var11) {
                        this.field2239 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2232 != null) {
                        this.field2232.close();
                    }
                    if (this.field2235 != null) {
                        this.field2235.close();
                    }
                    if (this.field2236 != null) {
                        this.field2236.close();
                    }
                } catch (IOException var10) {
                }
                this.field2231 = null;
                break;
            }
        } catch (Exception var15) {
            class165.method2883((String) null, var15);
        }
    }

    @ObfuscatedName("fu.x([BIII)V")
    public void method3021(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3043(arg0, arg1, arg2);
    }
}
