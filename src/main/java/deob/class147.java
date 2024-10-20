package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("en")
public final class class147 implements Runnable {

    @ObfuscatedName("en.f")
    public InputStream field2227;

    @ObfuscatedName("en.e")
    public OutputStream field2230;

    @ObfuscatedName("en.n")
    public Socket field2231;

    @ObfuscatedName("en.t")
    public boolean field2229 = false;

    @ObfuscatedName("en.v")
    public class140 field2238;

    @ObfuscatedName("en.b")
    public class150 field2228;

    @ObfuscatedName("en.m")
    public byte[] field2226;

    @ObfuscatedName("en.k")
    public int field2233 = 0;

    @ObfuscatedName("en.c")
    public int field2234 = 0;

    @ObfuscatedName("en.w")
    public boolean field2235 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2238 = arg1;
        this.field2231 = arg0;
        this.field2231.setSoTimeout(30000);
        this.field2231.setTcpNoDelay(true);
        this.field2231.setReceiveBufferSize(16384);
        this.field2231.setSendBufferSize(16384);
        this.field2227 = this.field2231.getInputStream();
        this.field2230 = this.field2231.getOutputStream();
    }

    @ObfuscatedName("en.t(I)V")
    public void method2860() {
        if (this.field2229) {
            return;
        }
        synchronized (this) {
            this.field2229 = true;
            this.notifyAll();
        }
        if (this.field2228 != null) {
            while (this.field2228.field2263 == 0) {
                class131.method2276(1L);
            }
            if (this.field2228.field2263 == 1) {
                try {
                    ((Thread) this.field2228.field2267).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2228 = null;
    }

    public void finalize() {
        this.method2860();
    }

    @ObfuscatedName("en.v(I)I")
    public int method2879() throws IOException {
        return this.field2229 ? 0 : this.field2227.read();
    }

    @ObfuscatedName("en.b(I)I")
    public int method2863() throws IOException {
        return this.field2229 ? 0 : this.field2227.available();
    }

    @ObfuscatedName("en.m([BIII)V")
    public void method2864(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2229) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2227.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("en.k([BIII)V")
    public void method2859(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2229) {
            return;
        }
        if (this.field2235) {
            this.field2235 = false;
            throw new IOException();
        }
        if (this.field2226 == null) {
            this.field2226 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2226[this.field2234] = arg0[arg1 + var5];
                this.field2234 = (this.field2234 + 1) % 5000;
                if ((this.field2233 + 4900) % 5000 == this.field2234) {
                    throw new IOException();
                }
            }
            if (this.field2228 == null) {
                this.field2228 = this.field2238.method2768(this, 3);
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
                            if (this.field2229) {
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
                            var4 = 5000 - this.field2233;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2230.write(this.field2226, var3, var4);
                    } catch (IOException var12) {
                        this.field2235 = true;
                    }
                    this.field2233 = (this.field2233 + var4) % 5000;
                    try {
                        if (this.field2234 == this.field2233) {
                            this.field2230.flush();
                        }
                    } catch (IOException var11) {
                        this.field2235 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2227 != null) {
                        this.field2227.close();
                    }
                    if (this.field2230 != null) {
                        this.field2230.close();
                    }
                    if (this.field2231 != null) {
                        this.field2231.close();
                    }
                } catch (IOException var10) {
                }
                this.field2226 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method2194((String) null, var15);
        }
    }
}
