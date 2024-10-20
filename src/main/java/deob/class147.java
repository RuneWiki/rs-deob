package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ec")
public final class class147 implements Runnable {

    @ObfuscatedName("ec.s")
    public InputStream field2217;

    @ObfuscatedName("ec.z")
    public OutputStream field2218;

    @ObfuscatedName("ec.t")
    public Socket field2219;

    @ObfuscatedName("ec.y")
    public boolean field2220 = false;

    @ObfuscatedName("ec.p")
    public class140 field2221;

    @ObfuscatedName("ec.g")
    public class150 field2225;

    @ObfuscatedName("ec.m")
    public byte[] field2223;

    @ObfuscatedName("ec.f")
    public int field2224 = 0;

    @ObfuscatedName("ec.k")
    public int field2227 = 0;

    @ObfuscatedName("ec.h")
    public boolean field2226 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2221 = arg1;
        this.field2219 = arg0;
        this.field2219.setSoTimeout(30000);
        this.field2219.setTcpNoDelay(true);
        this.field2219.setReceiveBufferSize(16384);
        this.field2219.setSendBufferSize(16384);
        this.field2217 = this.field2219.getInputStream();
        this.field2218 = this.field2219.getOutputStream();
    }

    @ObfuscatedName("ec.t(I)V")
    public void method2855() {
        if (this.field2220) {
            return;
        }
        synchronized (this) {
            this.field2220 = true;
            this.notifyAll();
        }
        if (this.field2225 != null) {
            while (this.field2225.field2258 == 0) {
                class131.method182(1L);
            }
            if (this.field2225.field2258 == 1) {
                try {
                    ((Thread) this.field2225.field2262).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2225 = null;
    }

    public void finalize() {
        this.method2855();
    }

    @ObfuscatedName("ec.y(I)I")
    public int method2860() throws IOException {
        return this.field2220 ? 0 : this.field2217.read();
    }

    @ObfuscatedName("ec.p(I)I")
    public int method2857() throws IOException {
        return this.field2220 ? 0 : this.field2217.available();
    }

    @ObfuscatedName("ec.g([BIII)V")
    public void method2865(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2220) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2217.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ec.m([BIIB)V")
    public void method2856(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2220) {
            return;
        }
        if (this.field2226) {
            this.field2226 = false;
            throw new IOException();
        }
        if (this.field2223 == null) {
            this.field2223 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2223[this.field2227] = arg0[arg1 + var5];
                this.field2227 = (this.field2227 + 1) % 5000;
                if ((this.field2224 + 4900) % 5000 == this.field2227) {
                    throw new IOException();
                }
            }
            if (this.field2225 == null) {
                this.field2225 = this.field2221.method2755(this, 3);
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
                        if (this.field2227 == this.field2224) {
                            if (this.field2220) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2224;
                        if (this.field2227 >= this.field2224) {
                            var4 = this.field2227 - this.field2224;
                        } else {
                            var4 = 5000 - this.field2224;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2218.write(this.field2223, var3, var4);
                    } catch (IOException var12) {
                        this.field2226 = true;
                    }
                    this.field2224 = (this.field2224 + var4) % 5000;
                    try {
                        if (this.field2227 == this.field2224) {
                            this.field2218.flush();
                        }
                    } catch (IOException var11) {
                        this.field2226 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2217 != null) {
                        this.field2217.close();
                    }
                    if (this.field2218 != null) {
                        this.field2218.close();
                    }
                    if (this.field2219 != null) {
                        this.field2219.close();
                    }
                } catch (IOException var10) {
                }
                this.field2223 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method2846((String) null, var15);
        }
    }
}
