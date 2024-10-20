package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fc")
public class class157 {

    @ObfuscatedName("fc.m")
    public int field1746 = -1;

    @ObfuscatedName("fc.x")
    public String field1741;

    @ObfuscatedName("fc.j")
    public class104 field1742;

    @ObfuscatedName("fc.v")
    public String field1743 = null;

    @ObfuscatedName("fc.h")
    public float[] field1744 = new float[4];

    @ObfuscatedName("fc.t")
    public ArrayList field1735 = new ArrayList();

    @ObfuscatedName("fc.u")
    public ArrayList field1745 = new ArrayList();

    @ObfuscatedName("fc.d")
    public ArrayList field1737 = new ArrayList();

    @ObfuscatedName("fc.b")
    public Map field1750 = new HashMap();

    @ObfuscatedName("fc.a")
    public Map field1749 = new HashMap();

    @ObfuscatedName("fc.c(Ljava/lang/String;Lch;B)Z")
    public boolean method3050(String arg0, class102 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3030();
            try {
                this.field1741 = arg0;
                this.field1742 = arg1.method2554(new URL(this.field1741));
                this.field1746 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3030();
                this.field1746 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("fc.p(Lch;I)V")
    public void method3021(class102 arg0) {
        switch(this.field1746) {
            case 0:
                this.method3034(arg0);
                break;
            case 1:
                this.method3032();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("fc.f(B)I")
    public int method3022() {
        return this.field1746;
    }

    @ObfuscatedName("fc.n(Ljava/lang/String;B)I")
    public int method3023(String arg0) {
        return this.field1750.containsKey(arg0) ? (Integer) this.field1750.get(arg0) : -1;
    }

    @ObfuscatedName("fc.k(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3074(String arg0) {
        return (String) ((String) (this.field1749.containsKey(arg0) ? this.field1749.get(arg0) : null));
    }

    @ObfuscatedName("fc.w(S)Ljava/util/ArrayList;")
    public ArrayList method3045() {
        return this.field1745;
    }

    @ObfuscatedName("fc.s(B)Ljava/util/ArrayList;")
    public ArrayList method3026() {
        return this.field1737;
    }

    @ObfuscatedName("fc.q(I)Ljava/lang/String;")
    public String method3084() {
        return this.field1743;
    }

    @ObfuscatedName("fc.m(I)[F")
    public float[] method3028() {
        return this.field1744;
    }

    @ObfuscatedName("fc.x(I)Ljava/util/ArrayList;")
    public ArrayList method3029() {
        return this.field1735;
    }

    @ObfuscatedName("fc.j(B)V")
    public void method3030() {
        this.field1742 = null;
        this.field1743 = null;
        this.field1744[0] = 0.0F;
        this.field1744[1] = 0.0F;
        this.field1744[2] = 1.0F;
        this.field1744[3] = 1.0F;
        this.field1735.clear();
        this.field1745.clear();
        this.field1737.clear();
        this.field1750.clear();
        this.field1749.clear();
    }

    @ObfuscatedName("fc.v(Lch;I)V")
    public void method3034(class102 arg0) {
        if (this.field1742 == null || !this.field1742.method2596()) {
            return;
        }
        byte[] var2 = this.field1742.method2589();
        if (var2 == null) {
            this.method3030();
            this.field1746 = 100;
            return;
        }
        JSONObject var5;
        try {
            class402 var3 = new class402(var2);
            JSONObject var4 = var3.method6629();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method3030();
            this.field1746 = 102;
            return;
        }
        try {
            this.method3033(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1745.clear();
        }
        try {
            this.method3082(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1737.clear();
        }
        try {
            this.method3035(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1743 = null;
            this.field1744[0] = 0.0F;
            this.field1744[1] = 0.0F;
            this.field1744[2] = 1.0F;
            this.field1744[3] = 1.0F;
            this.field1735.clear();
        }
        try {
            this.method3049(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1750.clear();
            this.field1749.clear();
        }
        this.field1746 = this.field1745.size() > 0 ? 1 : 2;
        this.field1742 = null;
    }

    @ObfuscatedName("fc.h(B)V")
    public void method3032() {
        Iterator var1 = this.field1745.iterator();
        class162 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1745.iterator();
                while (var3.hasNext()) {
                    class162 var4 = (class162) var3.next();
                    if (var4.field1787 != null) {
                        byte[] var5 = var4.field1787.method2589();
                        if (var5 != null && var5.length > 0) {
                            this.field1746 = 2;
                            return;
                        }
                    }
                }
                this.method3030();
                this.field1746 = 101;
                return;
            }
            var2 = (class162) var1.next();
        } while (var2.field1787 == null || var2.field1787.method2596());
    }

    @ObfuscatedName("fc.t(Lorg/json/JSONArray;Lch;B)V")
    public void method3033(JSONArray arg0, class102 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class162 var5 = new class162(this);
                var5.field1787 = arg1.method2554(new URL(var4.getString("src")));
                var5.field1782 = method3261(var4, "placement");
                this.field1745.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("fc.u(Lorg/json/JSONArray;S)V")
    public void method3082(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class163 var4 = new class163(this);
            var4.field1789 = var3.getString("text");
            var4.field1793 = method3117(var3.getString("align_x"));
            var4.field1794 = method3117(var3.getString("align_y"));
            var4.field1795 = var3.getInt("font");
            var4.field1792 = method3261(var3, "placement");
            this.field1737.add(var4);
        }
    }

    @ObfuscatedName("fc.d(Lorg/json/JSONObject;I)V")
    public void method3035(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1744 = method3261(arg0, "clickbounds");
        this.field1743 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1735.add(new class164(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1735.add(new class164(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1735.add(new class164(this, var2[var3], 0));
                        } else {
                            this.field1735.add(new class156(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.b(Lorg/json/JSONObject;I)V")
    public void method3049(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1750.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1750.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1750.put(var2[var3], 0);
                    } else {
                        this.field1749.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("fe.a(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method3261(JSONObject arg0, String arg1) throws JSONException {
        float[] var2 = new float[4];
        try {
            JSONArray var3 = arg0.getJSONArray(arg1);
            var2[0] = (float) var3.optDouble(0, 0.0D);
            var2[1] = (float) var3.optDouble(1, 0.0D);
            var2[2] = (float) var3.optDouble(2, 1.0D);
            var2[3] = (float) var3.optDouble(3, 1.0D);
        } catch (JSONException var5) {
            var2[0] = 0.0F;
            var2[1] = 0.0F;
            var2[2] = 1.0F;
            var2[3] = 1.0F;
        }
        return var2;
    }

    @ObfuscatedName("fg.l(Ljava/lang/String;B)I")
    public static int method3117(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
