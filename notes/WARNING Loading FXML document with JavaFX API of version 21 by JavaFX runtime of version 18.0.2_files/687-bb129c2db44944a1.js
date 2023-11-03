"use strict";(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[687],{66661:function(e,t){t.Z={src:"/_next/static/media/phind_v2.45c8fa3b.svg",height:434,width:1232}},92929:function(e,t,n){var i=n(85893),l=n(63984),s=n(76393),a=n(67294),r=n(48783),o=n(78543),c=n(12372),d=n(3176),h=n(65629);let m=e=>{var t;let n=r.Z.highlightAuto(e);return null!==(t=n.language)&&void 0!==t?t:"text"};function u(e){let{children:t,highlighterProps:n,url:r,className:u}=e,x=(0,a.useRef)(null),[p,w]=(0,a.useState)(!1),[b,g]=(0,a.useState)(!1),v=()=>{o.n.track("Click Copy Code Snippet",{children:t}),navigator.clipboard.writeText(t),g(!0),setTimeout(()=>{g(!1)},2e3)},f=()=>{o.n.track("Click Code Source Link",{url:r})},j=r?new URL(r):null,y=j?"".concat(j.protocol,"//").concat(j.hostname):"",k=/language-(\w+)/.exec(u||""),N=k?k[1]:m(t),C=async()=>{var e,n,i,l;o.n.track("Click Edit Code Snippet",{children:t}),(!(null===(e=x.current)||void 0===e?void 0:e.success)||!(null===(n=x.current)||void 0===n?void 0:n.expires)||(null===(i=x.current)||void 0===i?void 0:i.expires)<Date.now())&&(w(!0),await(0,d.v8)(t,N).then(e=>{w(!1),x.current=e})),(null===(l=x.current)||void 0===l?void 0:l.link)&&window.open(x.current.link)};return(0,i.jsxs)("div",{className:"mt-3 p-1",style:{backgroundColor:c.L5,borderRadius:"12px"},children:[(0,i.jsx)(l.Z,{children:String(t),style:s.Z,language:N,PreTag:"div",...n}),(0,i.jsxs)("div",{className:"flex",children:[(0,i.jsx)("button",{className:"btn btn-circle mt-n5",type:"submit",onClick:v,children:b?(0,i.jsx)("i",{className:"fe fe-check text-success"}):(0,i.jsx)("i",{className:"fe fe-copy",style:{color:"white"}})}),(0,i.jsx)(h.Z,{message:"Run on Replit",placement:"bottom",children:(0,i.jsx)("button",{className:"btn btn-circle mt-n5",type:"submit",onClick:C,children:p?(0,i.jsx)("i",{className:"fe fe-loader",style:{color:"white"}}):(0,i.jsx)("i",{className:"fe fe-play",style:{color:"white"}})})}),(0,i.jsx)("a",{className:"fw-bold fs-6 text-white mt-n1",style:{wordBreak:"break-word",display:"inline-block",position:"relative",bottom:10,right:0},target:"_blank",onClick:f,href:r,rel:"noreferrer",children:(0,i.jsx)("h6",{className:"text-always-white",children:y})})]})]})}u.defaultProps={className:""},t.Z=(0,a.memo)(u)},81794:function(e,t,n){var i=n(85893),l=n(25675),s=n.n(l),a=n(41664),r=n.n(a),o=n(50254),c=n(93506),d=n(44355);t.Z=function(e){let{showChatHistoryModal:t,setShowChatHistoryModal:n}=e;return(0,i.jsx)("nav",{className:"pt-5",children:(0,i.jsxs)("div",{className:"text-left d-flex justify-content-between",children:[(0,i.jsx)(r(),{href:"/",children:(0,i.jsx)(s(),{className:"img-fluid mb-2 darkmode-img mt-4",width:100,height:35,src:"/images/phind_v2.svg",alt:"...",style:{maxWidth:"100%",height:"auto"},priority:!0})}),(0,i.jsxs)("div",{className:"input-group d-flex flex-row-reverse",children:[(0,i.jsx)(o.Z,{}),(0,i.jsx)(d.Z,{}),(0,i.jsx)(c.Z,{show:t,setShow:n})]})]})})}},27052:function(e,t,n){var i=n(85893),l=n(67294);function s(e){let{question:t,lastAnswer:n,conversationContent:l}=e;return(0,i.jsxs)(i.Fragment,{children:[(0,i.jsx)("button",{type:"button",className:"btn btn-light btn-sm dropdown dropdown-toggle m-1","data-bs-toggle":"dropdown","aria-expanded":"false",children:(0,i.jsx)("i",{className:"fe fe-share m-2"})}),(0,i.jsxs)("ul",{className:"dropdown-menu","aria-labelledby":"dropdownMenu2",children:[(0,i.jsx)("h6",{className:"dtopdown-header text-uppercase",children:" Share "}),(0,i.jsx)("li",{children:(0,i.jsxs)("button",{className:"dropdown-item",type:"button",onClick:()=>{navigator.clipboard.writeText(window.location.href)},children:[(0,i.jsx)("svg",{xmlns:"http://www.w3.org/2000/svg",width:"16",height:"16",fill:"currentColor",className:"bi bi-clipboard-fill m-1",viewBox:"1 2 16 16",children:(0,i.jsx)("path",{fillRule:"evenodd",d:"M10 1.5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-1Zm-5 0A1.5 1.5 0 0 1 6.5 0h3A1.5 1.5 0 0 1 11 1.5v1A1.5 1.5 0 0 1 9.5 4h-3A1.5 1.5 0 0 1 5 2.5v-1Zm-2 0h1v1A2.5 2.5 0 0 0 6.5 5h3A2.5 2.5 0 0 0 12 2.5v-1h1a2 2 0 0 1 2 2V14a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V3.5a2 2 0 0 1 2-2Z"})}),"Copy Link"]})}),n&&(0,i.jsx)("li",{children:(0,i.jsxs)("button",{className:"dropdown-item",type:"button",onClick:()=>{navigator.clipboard.writeText(n)},children:[(0,i.jsx)("svg",{xmlns:"http://www.w3.org/2000/svg",width:"16",height:"16",fill:"currentColor",className:"bi bi-clipboard-fill m-1",viewBox:"1 2 16 16",children:(0,i.jsx)("path",{fillRule:"evenodd",d:"M10 1.5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-1Zm-5 0A1.5 1.5 0 0 1 6.5 0h3A1.5 1.5 0 0 1 11 1.5v1A1.5 1.5 0 0 1 9.5 4h-3A1.5 1.5 0 0 1 5 2.5v-1Zm-2 0h1v1A2.5 2.5 0 0 0 6.5 5h3A2.5 2.5 0 0 0 12 2.5v-1h1a2 2 0 0 1 2 2V14a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V3.5a2 2 0 0 1 2-2Z"})}),"Copy this Answer"]})}),l&&(0,i.jsx)("li",{children:(0,i.jsxs)("button",{className:"dropdown-item",type:"button",onClick:()=>{navigator.clipboard.writeText(l)},children:[(0,i.jsx)("svg",{xmlns:"http://www.w3.org/2000/svg",width:"16",height:"16",fill:"currentColor",className:"bi bi-clipboard-fill m-1",viewBox:"1 2 16 16",children:(0,i.jsx)("path",{fillRule:"evenodd",d:"M10 1.5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-1Zm-5 0A1.5 1.5 0 0 1 6.5 0h3A1.5 1.5 0 0 1 11 1.5v1A1.5 1.5 0 0 1 9.5 4h-3A1.5 1.5 0 0 1 5 2.5v-1Zm-2 0h1v1A2.5 2.5 0 0 0 6.5 5h3A2.5 2.5 0 0 0 12 2.5v-1h1a2 2 0 0 1 2 2V14a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V3.5a2 2 0 0 1 2-2Z"})}),"Copy Conversation"]})}),(0,i.jsx)("li",{children:(0,i.jsxs)("button",{className:"dropdown-item",type:"button",onClick:()=>{let e="https://twitter.com/intent/tweet?text=Phind Search: ".concat(encodeURIComponent(t),"&url=").concat(encodeURIComponent(window.location.href));window.open(e,"_blank")},children:[(0,i.jsx)("svg",{xmlns:"http://www.w3.org/2000/svg",width:"16",height:"16",fill:"currentColor",className:"bi bi-twitter m-1",viewBox:"0 2 16 16",children:(0,i.jsx)("path",{d:"M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z"})}),"Twitter"]})})]})]})}s.defaultProps={lastAnswer:"",conversationContent:""},t.Z=(0,l.memo)(s)},35572:function(e,t,n){var i=n(85893);n(67294);var l=n(99017),s=n(25675),a=n.n(s),r=n(66661),o=n(33299),c=n(41664),d=n.n(c),h=n(78543);t.Z=function(e){let{show:t,setShow:n,setShowUpgradeModalAllowed:s,isLoggedIn:c}=e,m=()=>n(!1);return(0,i.jsx)(l.Z,{show:t,onHide:m,children:(0,i.jsxs)(l.Z.Body,{className:"bg-light",children:[(0,i.jsx)(a(),{className:"img darkmode-img justify-content-center text-center",width:75,height:36,src:r.Z,alt:"...",priority:!0}),(0,i.jsx)(l.Z.Title,{className:"mt-4",children:c?"You've used your 10 free GPT-4 searches today.":"Sign in for more GPT-4 uses."}),(0,i.jsx)("p",{className:"fs-5 mt-2",children:c?(0,i.jsxs)("ul",{children:[(0,i.jsx)("li",{children:"You will get another 10 GPT-4 uses tomorrow."}),(0,i.jsxs)("li",{children:["You can upgrade to Phind Pro for"," ",(0,i.jsx)("span",{className:"text-primary",children:"unlimited daily GPT-4 searches."})]}),(0,i.jsx)("li",{children:"The Phind Model and GPT-3.5-Turbo remain unlimited."})]}):"With an account, you get 10 free GPT-4 searches per day. The Phind Model and GPT-3.5-Turbo remain unlimited even without an account."}),c?(0,i.jsx)(d(),{className:"btn btn-primary btn-sm",onClick:()=>{h.n.track("Upgrade modal clicked plans button")},href:"/plans",children:"Try Phind Pro"}):(0,i.jsx)("button",{className:"btn btn-primary btn-sm",type:"button",onClick:()=>{n(!1),(0,o.signIn)().then(()=>{h.n.track("Upgrade modal sign in")})},children:"Sign in"}),(0,i.jsx)("button",{className:"btn btn-secondary btn-sm mx-2",type:"button",onClick:()=>{n(!1)},children:"Dismiss"}),(0,i.jsx)("br",{}),(0,i.jsx)("button",{className:"btn fs-6 fw-bold text-dark text-decoration-underline p-0 mt-2",type:"button",onClick:()=>{s(!1),n(!1)},children:"Do not show this again."})]})})}},60161:function(e,t,n){var i=n(85893),l=n(67294),s=n(78543),a=n(96769);let r=e=>{let t=e.replaceAll("<strong>","").replaceAll("</strong>","").replaceAll("&#x27;","").replaceAll("&quot;","").split(" "),n=t.slice(0,Math.min(25,t.length)),i=n.join(" ").slice(0,160);return"".concat(i,".. ")};t.Z=(0,l.memo)(function(e){let{webResult:{url:t,title:n,description:l},openLinksInNewTab:o}=e,c=(0,a._P)(t),d=t.replace(/(^\w+:|^)\/\//,""),h=d.split("/").filter(e=>""!==e),m=h.join(" > "),u=()=>{let{index:i}=e;s.n.track("Click Web Link",{index:i,title:n,url:t})},x=(0,i.jsxs)("div",{className:"pb-2",children:[(0,i.jsxs)("div",{className:"d-flex",children:[(0,i.jsx)("span",{style:{marginRight:10},children:(0,i.jsx)("img",{src:"https://www.google.com/s2/favicons?domain=".concat(c),alt:"favicon-".concat(c),width:16,height:16})}),(0,i.jsx)("span",{className:"fs-6 text-gray-600 text-truncate d-inline align-self-center",children:m})]}),(0,i.jsx)("a",{target:o?"_blank":"_self",className:"mb-0",rel:"noreferrer",href:t,onClick:u,children:n}),(0,i.jsx)("p",{className:"mb-0 fs-6",children:r(l)})]});return x})}}]);