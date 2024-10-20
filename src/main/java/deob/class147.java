package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ec")
public final class class147 implements Runnable {

    @ObfuscatedName("ec.k")
    public InputStream field2238;

    @ObfuscatedName("ec.q")
    public OutputStream field2228;

    @ObfuscatedName("ec.f")
    public Socket field2229;

    @ObfuscatedName("ec.c")
    public boolean field2227 = false;

    @ObfuscatedName("ec.v")
    public class140 field2240;

    @ObfuscatedName("ec.j")
    public class150 field2231;

    @ObfuscatedName("ec.m")
    public byte[] field2233;

    @ObfuscatedName("ec.y")
    public int field2234 = 0;

    @ObfuscatedName("ec.u")
    public int field2235 = 0;

    @ObfuscatedName("ec.h")
    public boolean field2236 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2240 = arg1;
        this.field2229 = arg0;
        this.field2229.setSoTimeout(30000);
        this.field2229.setTcpNoDelay(true);
        this.field2229.setReceiveBufferSize(16384);
        this.field2229.setSendBufferSize(16384);
        this.field2238 = this.field2229.getInputStream();
        this.field2228 = this.field2229.getOutputStream();
    }

    @ObfuscatedName("ec.f(I)V")
    public void method2862() {
        if (this.field2227) {
            return;
        }
        synchronized (this) {
            this.field2227 = true;
            this.notifyAll();
        }
        if (this.field2231 != null) {
            while (this.field2231.field2269 == 0) {
                class131.method2702(1L);
            }
            if (this.field2231.field2269 == 1) {
                try {
                    ((Thread) this.field2231.field2263).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2231 = null;
    }

    public void finalize() {
        this.method2862();
    }

    @ObfuscatedName("ec.c(B)I")
    public int method2863() throws IOException {
        return this.field2227 ? 0 : this.field2238.read();
    }

    @ObfuscatedName("ec.v(B)I")
    public int method2864() throws IOException {
        return this.field2227 ? 0 : this.field2238.available();
    }

    @ObfuscatedName("ec.j([BIIB)V")
    public void method2866(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2227) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2238.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ec.m([BIIB)V")
    public void method2869(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2227) {
            return;
        }
        if (this.field2236) {
            this.field2236 = false;
            throw new IOException();
        }
        if (this.field2233 == null) {
            this.field2233 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2233[this.field2235] = arg0[arg1 + var5];
                this.field2235 = (this.field2235 + 1) % 5000;
                if ((this.field2234 + 4900) % 5000 == this.field2235) {
                    throw new IOException();
                }
            }
            if (this.field2231 == null) {
                this.field2231 = this.field2240.method2766(this, 3);
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
                        if (this.field2235 == this.field2234) {
                            if (this.field2227) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2234;
                        if (this.field2235 >= this.field2234) {
                            var4 = this.field2235 - this.field2234;
                        } else {
                            var4 = 5000 - this.field2234;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2228.write(this.field2233, var3, var4);
                    } catch (IOException var12) {
                        this.field2236 = true;
                    }
                    this.field2234 = (this.field2234 + var4) % 5000;
                    try {
                        if (this.field2235 == this.field2234) {
                            this.field2228.flush();
                        }
                    } catch (IOException var11) {
                        this.field2236 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2238 != null) {
                        this.field2238.close();
                    }
                    if (this.field2228 != null) {
                        this.field2228.close();
                    }
                    if (this.field2229 != null) {
                        this.field2229.close();
                    }
                } catch (IOException var10) {
                }
                this.field2233 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method2817((String) null, var15);
        }
    }
}
