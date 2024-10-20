package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fq")
public final class class160 implements Runnable {

    @ObfuscatedName("fq.n")
    public InputStream field2286;

    @ObfuscatedName("fq.p")
    public OutputStream field2277;

    @ObfuscatedName("fq.i")
    public Socket field2279;

    @ObfuscatedName("fq.j")
    public boolean field2280 = false;

    @ObfuscatedName("fq.f")
    public class155 field2281;

    @ObfuscatedName("fq.m")
    public class154 field2282;

    @ObfuscatedName("fq.c")
    public byte[] field2283;

    @ObfuscatedName("fq.z")
    public int field2284 = 0;

    @ObfuscatedName("fq.h")
    public int field2285 = 0;

    @ObfuscatedName("fq.g")
    public boolean field2278 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2281 = arg1;
        this.field2279 = arg0;
        this.field2279.setSoTimeout(30000);
        this.field2279.setTcpNoDelay(true);
        this.field2279.setReceiveBufferSize(16384);
        this.field2279.setSendBufferSize(16384);
        this.field2286 = this.field2279.getInputStream();
        this.field2277 = this.field2279.getOutputStream();
    }

    @ObfuscatedName("fq.n(I)V")
    public void method2755() {
        if (this.field2280) {
            return;
        }
        synchronized (this) {
            this.field2280 = true;
            this.notifyAll();
        }
        if (this.field2282 != null) {
            while (this.field2282.field2237 == 0) {
                class182.method1713(1L);
            }
            if (this.field2282.field2237 == 1) {
                try {
                    ((Thread) this.field2282.field2241).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2282 = null;
    }

    public void finalize() {
        this.method2755();
    }

    @ObfuscatedName("fq.p(I)I")
    public int method2756() throws IOException {
        return this.field2280 ? 0 : this.field2286.read();
    }

    @ObfuscatedName("fq.i(B)I")
    public int method2757() throws IOException {
        return this.field2280 ? 0 : this.field2286.available();
    }

    @ObfuscatedName("fq.j([BIII)V")
    public void method2765(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2280) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2286.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fq.f([BIII)V")
    public void method2759(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2280) {
            return;
        }
        if (this.field2278) {
            this.field2278 = false;
            throw new IOException();
        }
        if (this.field2283 == null) {
            this.field2283 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2283[this.field2285] = arg0[arg1 + var5];
                this.field2285 = (this.field2285 + 1) % 5000;
                if ((this.field2284 + 4900) % 5000 == this.field2285) {
                    throw new IOException();
                }
            }
            if (this.field2282 == null) {
                this.field2282 = this.field2281.method2715(this, 3);
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
                        if (this.field2285 == this.field2284) {
                            if (this.field2280) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2284;
                        if (this.field2285 >= this.field2284) {
                            var4 = this.field2285 - this.field2284;
                        } else {
                            var4 = 5000 - this.field2284;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2277.write(this.field2283, var3, var4);
                    } catch (IOException var12) {
                        this.field2278 = true;
                    }
                    this.field2284 = (this.field2284 + var4) % 5000;
                    try {
                        if (this.field2285 == this.field2284) {
                            this.field2277.flush();
                        }
                    } catch (IOException var11) {
                        this.field2278 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2286 != null) {
                        this.field2286.close();
                    }
                    if (this.field2277 != null) {
                        this.field2277.close();
                    }
                    if (this.field2279 != null) {
                        this.field2279.close();
                    }
                } catch (IOException var10) {
                }
                this.field2283 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method1609((String) null, var15);
        }
    }
}
