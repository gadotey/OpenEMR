@Solicitation @Regression
Feature: Business Rules for Solicitation Template Sections and Subsection

Description: 
Business Rules for Solicitation Template Sections and Subsection.


Background: login
   Given I'm an OJP Template Manager


#PI 2
#Sprint 2.2
#Story 119487

@sol-seq-1 @SmokeTest
Scenario: OJP Solicitation Template Type Drop down
   
   When I log into DCM
   Then Then I can select the Competitve solicitation type from the dropdown
   And view Competitive header of each page
 
 
#PI 2
#Sprint 2.2
#Story 119487
@sol-seq-2
Scenario: OJP Solicitation Template Type Drop down
   
   
   When I log into DCM
   Then Then I can select the Research solicitation type from a dropdown
   And view Research header of each page
   
   
#PI 2
#Sprint 2.2
#Story 119487
@sol-seq-3 @SmokeTest
Scenario: OJP Solicitation Template Type Drop down
   
   
   When I log into DCM
   Then Then I can select the Formula solicitation type from a dropdown
   And view Formula header of each page


#PI 2
#Sprint 2.2
#Story 119487
@sol-seq-4
Scenario: OJP Solicitation Template Type Drop down
   
   When I log into DCM
   Then Then I can select the Invited solicitation type from the dropdown
   And view Invited header of each page
 
 
 #PI 2
 #Sprint 2.2
 #Story 119496 
@sol-seq-5 @SmokeTest
Scenario: OJP Competitive Cover Page
 
   When I select the OJP Competitive cover page
   Then I can view the OJP Competitive cover page subsections and the corresponding pre-populated language


 #PI 2
 #Sprint 2.2
 #Story 119860
@sol-seq-6
 Scenario: OJP Research Cover Page

   When I select the OJP Research cover page
   Then I can view the OJP Research cover page subsections and the corresponding pre-populated language
  

 #PI 2
 #Sprint 2.2
 #Story 119850
 @sol-seq-7 @SmokeTest
 Scenario: OJP Formula Cover Page
  
   When I select the OJP Formula cover page
   Then I can view the OJP Formula cover page subsections and the corresponding pre-populated language
   
   
 #PI 2
 #Sprint 2.2
 #Story 119854
 @sol-seq-8
 Scenario: OJP Invited Cover Page
   
   When I select the OJP Invited cover page
   Then I can view the OJP Invited cover page subsections and the corresponding pre-populated language


  
 #PI 2
 #Sprint 2.2
 #Story 119600
 @sol-seq-9 @SmokeTest
 Scenario: Test OVW Cover Page
 
   Given I am an OVW solicitation template manager, 
   When I select the cover page
   Then I can view the OVW cover page subsections and the corresponding pre-populated language

   
   
 #PI 2
 #Sprint 2.2
 #Story 119618
 @sol-seq-10 @SmokeTest
 Scenario: COPS Cover Page
   
   Given I am a COPS solicitation template manager
   When I navigate to the cover page
   Then I can view the COPS cover page subsections and the corresponding pre-populated language
   
   
 #PI 2
 #Sprint 2.2
 #Story 119493
 @sol-seq-11 @SmokeTest
 Scenario: OJP Competitive Program Description
 
   When I navigate to the OJP Competitive program description
   Then I can view the OJP competitive program description subsections and the corresponding pre-populated language
   
   
 #PI 2
 #Sprint 2.2
 #Story 120032
 @sol-seq-12
 Scenario: OJP Research Program Description
 
   When I navigate to the OJP Research program description
   Then I can view the OJP research program description subsections and the corresponding pre-populated language
   
   
 #PI 2
 #Sprint 2.2
 #Story 120033
 @sol-seq-13 @SmokeTest
 Scenario: OJP Invited Program Description
 
   When I select the OJP Invited program description
   Then I can view the OJP Invited program description subsections and the corresponding pre-populated language
   
   
 #PI 2
 #Sprint 2.2
 #Story 120034
 @sol-seq-14
 Scenario: OJP Formula Program Description
 
   When I navigate to the OJP Formula program description
   Then I can view the OJP Formula program description subsections and the corresponding pre-populated language
   
   
 #PI 2
 #Sprint 2.2
 #Story 119602
 @sol-seq-15 @SmokeTest
 Scenario: OVW Program Description
 
   Given I am an OVW solicitation template manager, 
   When I select the program description
   Then I can view the OVW  program description subsections and the corresponding pre-populated language
   
   
 #PI 2
 #Sprint 2.2
 #Story 120042
 @sol-seq-16 @SmokeTest
 Scenario: COPS Program Description 
 
   Given I am an COPS template manager, 
   When I select the COPS program description
   Then I can view the COPS program description subsections and the corresponding pre-populated language
   
   
  
 #PI 2
 #Sprint 2.2
 #Story 19495
 @sol-seq-17 @SmokeTest
 Scenario: OJP Competitive Federal Award
 
   When I select the OJP Competitive Federal Award
   Then I can view the OJP Competitive Federal Award Information subsections and the corresponding pre-populated language 
   
   

 #PI 2
 #Sprint 2.2
 #Story 120039
 @sol-seq-18
 Scenario: OJP Research Federal Award
 
   When I select the OJP Research Federal Award
   Then I can view the OJP Research Federal Award Information subsections and the corresponding pre-populated language



 #PI 2
 #Sprint 2.2
 #Story 120041
 @sol-seq-19 @SmokeTest
 Scenario: OJP Formula Federal Award
  
   When I select the OJP Formula Federal Award
   Then I can view the OJP Formula Federal Award Information subsections and the corresponding pre-populated language



 #PI 2
 #Sprint 2.2
 #Story 120040
 @sol-seq-20
 Scenario: OJP Invited Federal Award
 
   When I select the OJP Invited Federal Award
   Then I can view the OJP Invited Federal Award Information subsections and the corresponding pre-populated language
 


 #PI 2
 #Sprint 2.2
 #Story 119604
 @sol-seq-21 @SmokeTest
 Scenario: OVW Federal Award

   Given I am an OVW solicitation template manager, 
   When I select the Federal Award
   Then I can view the OVW  Federal Award Information subsections and the corresponding pre-populated language



 #PI 2
 #Sprint 2.2
 #Story 119619
 @sol-seq-22 @SmokeTest
 Scenario: COPS Federal Award
 
   Given I am an COPS solicitation template manager 
   When I select the Federal Award section
   Then I can view the COPS Federal Award Information subsections and the corresponding pre-populated language

  
 #PI 2
 #Sprint 
 #Story  
   