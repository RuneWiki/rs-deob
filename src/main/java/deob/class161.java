package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fv")
public final class class161 implements Runnable {

    @ObfuscatedName("fv.j")
    public InputStream field2283;

    @ObfuscatedName("fv.h")
    public OutputStream field2273;

    @ObfuscatedName("fv.f")
    public Socket field2276;

    @ObfuscatedName("fv.p")
    public boolean field2275 = false;

    @ObfuscatedName("fv.x")
    public class156 field2281;

    @ObfuscatedName("fv.g")
    public class155 field2277;

    @ObfuscatedName("fv.c")
    public byte[] field2278;

    @ObfuscatedName("fv.l")
    public int field2279 = 0;

    @ObfuscatedName("fv.w")
    public int field2280 = 0;

    @ObfuscatedName("fv.b")
    public boolean field2274 = false;

    public class161(Socket arg0, class156 arg1) throws IOException {
        this.field2281 = arg1;
        this.field2276 = arg0;
        this.field2276.setSoTimeout(30000);
        this.field2276.setTcpNoDelay(true);
        this.field2276.setReceiveBufferSize(16384);
        this.field2276.setSendBufferSize(16384);
        this.field2283 = this.field2276.getInputStream();
        this.field2273 = this.field2276.getOutputStream();
    }

    @ObfuscatedName("fv.j(B)V")
    public void method2745() {
        if (this.field2275) {
            return;
        }
        synchronized (this) {
            this.field2275 = true;
            this.notifyAll();
        }
        if (this.field2277 != null) {
            while (this.field2277.field2231 == 0) {
                class183.method40(1L);
            }
            if (this.field2277.field2231 == 1) {
                try {
                    ((Thread) this.field2277.field2235).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2277 = null;
    }

    public void finalize() {
        this.method2745();
    }

    @ObfuscatedName("fv.h(I)I")
    public int method2760() throws IOException {
        return this.field2275 ? 0 : this.field2283.read();
    }

    @ObfuscatedName("fv.f(I)I")
    public int method2747() throws IOException {
        return this.field2275 ? 0 : this.field2283.available();
    }

    @ObfuscatedName("fv.p([BIIB)V")
    public void method2748(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2275) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2283.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fv.x([BIIB)V")
    public void method2749(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2275) {
            return;
        }
        if (this.field2274) {
            this.field2274 = false;
            throw new IOException();
        }
        if (this.field2278 == null) {
            this.field2278 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2278[this.field2280] = arg0[arg1 + var5];
                this.field2280 = (this.field2280 + 1) % 5000;
                if ((this.field2279 + 4900) % 5000 == this.field2280) {
                    throw new IOException();
                }
            }
            if (this.field2277 == null) {
                this.field2277 = this.field2281.method2704(this, 3);
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
                        if (this.field2280 == this.field2279) {
                            if (this.field2275) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2279;
                        if (this.field2280 >= this.field2279) {
                            var4 = this.field2280 - this.field2279;
                        } else {
                            var4 = 5000 - this.field2279;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2273.write(this.field2278, var3, var4);
                    } catch (IOException var12) {
                        this.field2274 = true;
                    }
                    this.field2279 = (this.field2279 + var4) % 5000;
                    try {
                        if (this.field2280 == this.field2279) {
                            this.field2273.flush();
                        }
                    } catch (IOException var11) {
                        this.field2274 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2283 != null) {
                        this.field2283.close();
                    }
                    if (this.field2273 != null) {
                        this.field2273.close();
                    }
                    if (this.field2276 != null) {
                        this.field2276.close();
                    }
                } catch (IOException var10) {
                }
                this.field2278 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method1698((String) null, var15);
        }
    }
}
