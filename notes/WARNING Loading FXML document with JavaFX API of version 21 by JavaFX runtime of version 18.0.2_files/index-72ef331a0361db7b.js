(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[405],{48312:function(e,s,t){(window.__NEXT_P=window.__NEXT_P||[]).push(["/",function(){return t(66078)}])},26513:function(e,s,t){"use strict";var n=t(85893),a=t(67294);s.Z=(0,a.memo)(function(){return(0,n.jsx)("footer",{className:"footer py-6 position-relative bg-white",children:(0,n.jsx)("div",{className:"container-lg",children:(0,n.jsx)("div",{className:"row align-items-center",children:(0,n.jsx)("div",{className:"col-12 col-md text-center text-md-left",children:(0,n.jsx)("small",{className:"text-gray-600",children:"Made with ❤️ in San Francisco."})})})})})})},99687:function(e,s,t){"use strict";var n=t(85893),a=t(33299),r=t(41664),i=t.n(r),l=t(78543),c=t(65629);s.Z=function(e){let{answerModel:s,setAnswerModel:t,requestsLeftForGPT4:r,session:o,useCreativeMode:d,setUseCreativeMode:m}=e;return(0,n.jsx)("div",{className:"form-check form-switch",children:(0,n.jsxs)("div",{className:"dropdown",children:[(0,n.jsxs)("button",{className:"btn p-0 fs-6 fw-bold text-dark text-decoration-underline' dropdown-toggle",type:"button","data-bs-toggle":"dropdown","aria-expanded":"false",children:[s,(0,n.jsx)("i",{className:"mx-1 fe fe-chevron-down text-black"})]}),(0,n.jsxs)("ul",{className:"dropdown-menu",children:[(0,n.jsx)("li",{children:(0,n.jsx)("div",{className:"row",children:(0,n.jsxs)("button",{className:"mx-1 dropdown-item d-flex align-items-center justify-content-between",type:"button",onClick:()=>{t("Phind Model")},children:["Phind Model","Phind Model"===s&&(0,n.jsx)("i",{className:"mx-1 fe fe-check text-always-dark"})]})})}),(0,n.jsx)("li",{children:(0,n.jsx)("div",{className:"row",children:(0,n.jsxs)("button",{className:"mx-1 dropdown-item d-flex align-items-center justify-content-between",type:"button",onClick:()=>{t("GPT-4")},children:["GPT-4","GPT-4"===s&&(0,n.jsx)("i",{className:"mx-1 fe fe-check text-always-dark"})]})})}),(0,n.jsxs)("li",{children:[(0,n.jsx)("div",{className:"row",children:(0,n.jsxs)("p",{className:"p-1 mt-5 mb-0 fs-6",children:[(0,n.jsxs)("span",{className:"text-primary",children:[Math.max(r,0)," ","GPT-4 uses left",o&&" today","."]}),(0,n.jsx)("br",{}),(0,n.jsx)("span",{className:"text-always-dark",children:"Phind Model has unlimited uses."}),!o&&r<=0&&(0,n.jsx)("button",{className:"btn fs-6 p-0 fw-bold text-always-dark text-decoration-underline",type:"button",onClick:()=>{(0,a.signIn)().then(()=>{l.n.track("Sign In")})},children:"Sign in for more GPT-4 model uses."}),o&&r<=0&&(0,n.jsx)(i(),{className:"btn fs-6 p-0 fw-bold text-always-dark text-decoration-underline",type:"button",href:"/plans",children:"Upgrade for more daily GPT-4 model uses."})]})}),(0,n.jsx)("div",{className:"row",children:(0,n.jsx)(c.Z,{message:"Forces the model to answer without considering search results.",children:(0,n.jsx)("div",{className:"form-check form-switch mt-5",children:(0,n.jsxs)("label",{className:"form-check-label fs-6 fw-bold",htmlFor:"Creative mode",children:["Ignore search results",(0,n.jsx)("input",{className:"form-check-input",type:"checkbox",value:"",id:"Creative Mode",checked:d,onChange:()=>{m(!d),l.n.track("Click Checkbox",{name:"Use creative mode",checked:d})}})]})})})})]})]})]})})}},26547:function(e,s,t){"use strict";var n=t(85893),a=t(25675),r=t.n(a),i=t(41664),l=t.n(i),c=t(50254),o=t(93506),d=t(44355);function m(e){let{showChatHistoryModal:s=!1,setShowChatHistoryModal:t,showAccountButton:a=!0}=e;return(0,n.jsx)("nav",{className:"pt-5",children:(0,n.jsxs)("div",{className:"container text-left d-flex justify-content-between px-6",children:[(0,n.jsx)(l(),{href:"/",children:(0,n.jsx)(r(),{className:"img-fluid ml-1 mb-2 darkmode-img mt-4 ps-4",width:150,height:52,src:"/images/phind_v2.svg",alt:"...",style:{maxWidth:"100%",height:"auto"},priority:!0})}),(0,n.jsxs)("div",{className:"input-group d-flex flex-row-reverse",children:[a&&(0,n.jsx)(c.Z,{}),(0,n.jsx)(d.Z,{}),a&&t&&(0,n.jsx)(o.Z,{show:s,setShow:t})]})]})})}m.defaultProps={showAccountButton:!0,showChatHistoryModal:!1,setShowChatHistoryModal:()=>{}},s.Z=m},66078:function(e,s,t){"use strict";t.r(s),t.d(s,{__N_SSP:function(){return p},default:function(){return N}});var n=t(85893),a=t(67294),r=t(33299),i=t(37870),l=t(96769),c=t(91745),o=t(65629),d=t(12372),m=t(78543),h=t(99687),x=t(48684);function u(e){let{isValidProPlan:s,numRequestsDone:t,planName:u,planNotExpired:f}=e,[j,w]=(0,c.Z)("usePairProgrammerMode",!1),[p,N]=(0,c.Z)("answerModel",d.Wg),[g,v]=(0,c.Z)("useCreativeMode",!1),{data:b}=(0,r.useSession)(),[k]=(0,c.Z)("numNotLoggedInRequestsDone",0),y=b?(0,l.N7)(u,f)-t:d.BH-k,[P,C]=(0,a.useState)(!1);(0,a.useEffect)(()=>C(!0),[]);let M=(0,n.jsx)(n.Fragment,{children:"Your AI search engine and pair programmer."}),{isXs:Z}=(0,x.k)(),S=s?d.CZ:d.M9,_="Phind Model"===p||"GPT-4"===p&&y<=0?d.c5:S;return(0,n.jsxs)("div",{className:"row justify-content-center",children:[(0,n.jsx)("div",{className:"col-10 mt-10",children:(0,n.jsx)("h1",{className:"display-4 mb-8 text-center mt-5",children:M})}),(0,n.jsx)("div",{className:"col-10",children:(0,n.jsx)("div",{className:"px-0",children:(0,n.jsx)(i.Z,{placeholder:Z?"Describe your task in detail.":"Describe your task in detail. What are you stuck on?",initialQuestionFromCache:"",initialContext:"",defaultNumRowsToShow:2,customSearchHandler:j?l.XD:void 0,answerModel:p,maxTokenLimit:_,children:(0,n.jsx)("div",{children:P&&(0,n.jsx)("div",{children:(0,n.jsxs)("div",{className:"mt-4",style:{display:"flex",justifyContent:"space-between"},children:[(0,n.jsx)(o.Z,{message:"Pair Programmer is more conversational and asks you clarification questions. It can be better for debugging.",children:(0,n.jsx)("div",{className:"form-check form-switch",children:(0,n.jsxs)("label",{className:"form-check-label fs-6 fw-bold",htmlFor:"Legacy Search",children:["Pair Programmer",(0,n.jsx)("input",{className:"form-check-input",type:"checkbox",value:"",id:"Pair Programmer",checked:j,onChange:()=>{w(!j),m.n.track("Click Checkbox",{name:"Use Pair Programmer",checked:j})}})]})})}),(0,n.jsx)(o.Z,{message:"Select your preferred answering model.",children:(0,n.jsx)(h.Z,{answerModel:p,setAnswerModel:N,requestsLeftForGPT4:y,session:b,useCreativeMode:g,setUseCreativeMode:v})})]})})})})})})]})}u.defaultProps={isValidProPlan:!1};var f=t(26513),j=t(5352),w=t(26547),p=!0,N=function(e){let{isValidProPlan:s,phindPlan:t,numRequestsDone:r,planNotExpired:i}=e,[l,c]=(0,a.useState)(!1);return(0,n.jsxs)(n.Fragment,{children:[(0,n.jsx)(w.Z,{showChatHistoryModal:l,setShowChatHistoryModal:c}),(0,n.jsx)("div",{className:"row",children:(0,n.jsx)("div",{className:"col-lg-12 col-md-12",children:(0,n.jsxs)("div",{style:{margin:"auto",display:"grid",textAlign:"center",alignItems:"center",justifyContent:"center",height:"100vh"},children:[(0,n.jsx)(u,{isValidProPlan:s,numRequestsDone:r,planName:t,planNotExpired:i}),(0,n.jsx)(j.Z,{show:l,setShow:c}),(0,n.jsx)("div",{className:"mt-10",children:(0,n.jsx)(f.Z,{})})]})})})]})}}},function(e){e.O(0,[48,419,721,17,870,68,147,774,888,179],function(){return e(e.s=48312)}),_N_E=e.O()}]);