package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ey")
public final class class144 implements Runnable {

    @ObfuscatedName("ey.a")
    public InputStream field2185;

    @ObfuscatedName("ey.w")
    public OutputStream field2176;

    @ObfuscatedName("ey.d")
    public Socket field2177;

    @ObfuscatedName("ey.c")
    public boolean field2179 = false;

    @ObfuscatedName("ey.y")
    public class137 field2184;

    @ObfuscatedName("ey.k")
    public class147 field2180;

    @ObfuscatedName("ey.r")
    public byte[] field2181;

    @ObfuscatedName("ey.p")
    public int field2182 = 0;

    @ObfuscatedName("ey.q")
    public int field2178 = 0;

    @ObfuscatedName("ey.m")
    public boolean field2183 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2184 = arg1;
        this.field2177 = arg0;
        this.field2177.setSoTimeout(30000);
        this.field2177.setTcpNoDelay(true);
        this.field2177.setReceiveBufferSize(16384);
        this.field2177.setSendBufferSize(16384);
        this.field2185 = this.field2177.getInputStream();
        this.field2176 = this.field2177.getOutputStream();
    }

    @ObfuscatedName("ey.w(I)V")
    public void method2926() {
        if (this.field2179) {
            return;
        }
        synchronized (this) {
            this.field2179 = true;
            this.notifyAll();
        }
        if (this.field2180 != null) {
            while (this.field2180.field2211 == 0) {
                class128.method56(1L);
            }
            if (this.field2180.field2211 == 1) {
                try {
                    ((Thread) this.field2180.field2212).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2180 = null;
    }

    public void finalize() {
        this.method2926();
    }

    @ObfuscatedName("ey.d(S)I")
    public int method2928() throws IOException {
        return this.field2179 ? 0 : this.field2185.read();
    }

    @ObfuscatedName("ey.c(I)I")
    public int method2929() throws IOException {
        return this.field2179 ? 0 : this.field2185.available();
    }

    @ObfuscatedName("ey.y([BIII)V")
    public void method2930(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2179) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2185.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ey.k([BIII)V")
    public void method2931(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2179) {
            return;
        }
        if (this.field2183) {
            this.field2183 = false;
            throw new IOException();
        }
        if (this.field2181 == null) {
            this.field2181 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2181[this.field2178] = arg0[arg1 + var5];
                this.field2178 = (this.field2178 + 1) % 5000;
                if ((this.field2182 + 4900) % 5000 == this.field2178) {
                    throw new IOException();
                }
            }
            if (this.field2180 == null) {
                this.field2180 = this.field2184.method2831(this, 3);
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
                        if (this.field2182 == this.field2178) {
                            if (this.field2179) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2182;
                        if (this.field2178 >= this.field2182) {
                            var4 = this.field2178 - this.field2182;
                        } else {
                            var4 = 5000 - this.field2182;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2176.write(this.field2181, var3, var4);
                    } catch (IOException var12) {
                        this.field2183 = true;
                    }
                    this.field2182 = (this.field2182 + var4) % 5000;
                    try {
                        if (this.field2182 == this.field2178) {
                            this.field2176.flush();
                        }
                    } catch (IOException var11) {
                        this.field2183 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2185 != null) {
                        this.field2185.close();
                    }
                    if (this.field2176 != null) {
                        this.field2176.close();
                    }
                    if (this.field2177 != null) {
                        this.field2177.close();
                    }
                } catch (IOException var10) {
                }
                this.field2181 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method650((String) null, var15);
        }
    }
}
